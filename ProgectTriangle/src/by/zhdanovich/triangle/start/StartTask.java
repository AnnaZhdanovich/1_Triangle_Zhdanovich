package by.zhdanovich.triangle.start;


import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import by.zhdanovich.triangle.parser.ParseFile;


public class StartTask {
	private static Logger log = LogManager.getLogger(StartTask.class);	
	
	public static void main(String[] args)  {
			log.info("Start application");	
			
		ParseFile parser= new ParseFile();
		try {
			parser.checkTriangle();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}