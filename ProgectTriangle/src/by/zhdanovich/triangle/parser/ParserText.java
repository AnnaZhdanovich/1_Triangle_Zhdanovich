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


public class ParserText {
	private static Logger log = LogManager.getLogger(ParserText.class);
public static final String FILE_NAME="text/data.txt";
public static final String UNICODE="UTF-8";
public List<Double> parseFromFile() throws IOException {
List<Double> list=new ArrayList<Double>() ;
String str;
BufferedReader br=null;
try {
    br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME), UNICODE));
  	while((str = br.readLine())!= null ){	  		
		 String[] numbers = str.split(" ");
		    for (String s: numbers) {		    	
		    	list.add(Double.parseDouble(s));		    	
		    }		       
   }
} catch (NumberFormatException e) {	
	   log.error("NumberFormatException: ", e); 
} catch (FileNotFoundException e) {	
	   log.error("FileNotFoundException: ", e); 
} catch (IOException e) {	
	   log.error("IOException:", e); 
} finally{
       if (br != null){    			
				
					br.close();
			
         }
   }
return list;
}
}

	

