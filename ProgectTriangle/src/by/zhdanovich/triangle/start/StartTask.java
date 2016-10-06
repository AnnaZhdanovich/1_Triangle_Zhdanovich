package by.zhdanovich.triangle.start;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import by.zhdanovich.triangle.action.ActionPoint;
import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.parser.ParserText;

public class StartTask {
	private static Logger log = LogManager.getLogger(StartTask.class);	
	public static void main(String[] args)  {
			log.info("Start application");
			
			Point a;
			Point b;
			Point c;
			Triangle t;
			ActionPoint action;
			List<Double> array;
			ParserText parser = new ParserText();
			
			try{				
			array = parser.parseFromFile();
			a = new Point(array.get(0), array.get(1));
			b = new Point(array.get(2), array.get(3));
			c = new Point(array.get(4), array.get(5));		
			t = new Triangle(a,b,c);				
			action = new ActionPoint();
			System.out.println(action.area(t)+" "+action.perimeter(t));
			
	} catch (IndexOutOfBoundsException e) {	
		log.error("IndexOutOfBoundsException: ", e); 			
	} catch (NullPointerException e) {	
		log.error("NullPointerException: ", e); 
	}catch (Exception e) {	
		log.error("Exception: ", e); 
	}
		log.info("Finish application");
	}

}
