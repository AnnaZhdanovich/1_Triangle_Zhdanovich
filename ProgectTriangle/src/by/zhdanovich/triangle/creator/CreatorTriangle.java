package by.zhdanovich.triangle.creator;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.exception.WrongCoordinateException;
import by.zhdanovich.triangle.parser.ParserText;


public class CreatorTriangle {
	private static Logger log = LogManager.getLogger(CreatorTriangle.class);
	
public List<Triangle> create(List<String> list){
		ParserText parser = new ParserText();
		List<Triangle> triangles= new ArrayList<Triangle>();		
	for(String s : list){
		try {			
		Triangle t = this.createTriangle(parser.parseText(s));
		triangles.add(t);
		} catch (WrongCoordinateException e) {
			log.error("Data error ", e);
		}
	}
	return triangles;		
	}
	
	private Triangle createTriangle(List<Double> list){	
		Point a = new Point(list.get(0),list.get(1));
		Point b = new Point(list.get(2),list.get(3));
		Point c =new Point(list.get(4),list.get(5));		
		Triangle t = new Triangle(a,b,c);
		return t;
	}

}
