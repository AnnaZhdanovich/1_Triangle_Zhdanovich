package by.zhdanovich.triangle.parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zhdanovich.triangle.action.ActionPoint;
import by.zhdanovich.triangle.creator.TriangleCreator;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.exception.WrongCoordinateException;


public class ParseFile {
private static Logger log = LogManager.getLogger(ParseFile.class);
public static final String FILE_NAME="text/data.txt";
public static final String UNICODE="UTF-8";

public void checkTriangle() throws IOException {
ParseText parser = new ParseText();
List<String> list = new ArrayList<String>() ;
List<Double> list1 = new ArrayList<Double>() ;
TriangleCreator cr=new TriangleCreator();
Triangle t;
ActionPoint act = new ActionPoint();
String str;
BufferedReader br=null;

try {
    br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME), UNICODE));    
  	while((str = br.readLine())!= null ){  
  		list.add(str); 
  		
  		try {  			
  		
		t= cr.createTriangle(parser.parseText(str));		
  		
  		act.perimeter(t);
  		System.out.println(act.area(t)+" "+ act.perimeter(t));
  		
  		} catch (WrongCoordinateException e) {
  			log.error("WrongCoordinateException: ", e); 			
  		} 
  	
  		
  	}
}catch (FileNotFoundException e) {	
	   log.error("FileNotFoundException: ", e); 
} catch (IOException e) {	
	   log.error("IOException:", e); 
} finally{
       if (br != null){  
					br.close();			
         }
   }

  	
}
}

	

