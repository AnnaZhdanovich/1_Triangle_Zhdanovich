package by.zhdanovich.triangle.parser;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReaderFile {
private static Logger log = LogManager.getLogger(ReaderFile.class);


public List<String> readeFile(String FILE_NAME, String UNICODE ){	
List<String> list = new ArrayList<String>();
String str;
BufferedReader br=null;

try {
    br = new BufferedReader(new InputStreamReader(new FileInputStream(FILE_NAME), UNICODE));    
  	while((str = br.readLine())!= null ){    			
  		list.add(str);
  	}
}  catch (FileNotFoundException e) {	
	   log.fatal("file was not found", e);
	   throw new RuntimeException();
} catch (IOException e) {	
	   log.error("IOException:", e); 
}
return list; 
}
 	
}


	

