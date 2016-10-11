package by.zhdanovich.triangle.performer;

import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.zhdanovich.triangle.action.ActionTriangle;
import by.zhdanovich.triangle.creator.CreatorTriangle;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.reader.ReaderFile;


public class PerformerAction {
	private static Logger log = LogManager.getLogger(PerformerAction.class);
	public static final String FILE_NAME="text/data.txt";
	public static final String UNICODE="UTF-8";	
	
public void doAction(){
	ReaderFile reader= new ReaderFile();
	CreatorTriangle creator = new CreatorTriangle();
	ActionTriangle action = new ActionTriangle();	
	try{
	List<String> list = reader.readFile(FILE_NAME, UNICODE);
	List<Triangle> triangles = creator.create(list);	
	for(Triangle tr : triangles){	
		System.out.println(">>>>> Area of a triangle: "+action.area(tr));		
		System.out.println(">>>>> Perimeter of a triangle: "+ action.perimeter(tr));
		System.out.println(">>>>> Point constitute triangle:" + action.checkPointLine(tr));
		System.out.println(">>>>> The triangle is rectangular: " + action.checkRectangular(tr));			
	}
	}catch(RuntimeException e)	{
		log.error("File not found", e); 
	}
}	
}
