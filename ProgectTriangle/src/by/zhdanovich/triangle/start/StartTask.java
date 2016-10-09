package by.zhdanovich.triangle.start;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zhdanovich.triangle.action.PerformerAct;
import by.zhdanovich.triangle.creator.CreatorTriangle;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.parser.ReaderFile;

public class StartTask {
	private static Logger log = LogManager.getLogger(ReaderFile.class);
	public static final String FILE_NAME="text/data.txt";
	public static final String UNICODE="UTF-8";	
	public static void main(String[] args) {		
	ReaderFile reader= new ReaderFile();
	CreatorTriangle creator = new CreatorTriangle();
	PerformerAct performer = new PerformerAct();
	try{
	List<String> list = reader.readeFile(FILE_NAME, UNICODE);
	List<Triangle> triangles = creator.create(list);	
	performer.doAction(triangles);		
	}catch(RuntimeException e)	{
		log.error("file not found", e); 
	}
}
}