package by.zhdanovich.triangle.creator;

import java.util.List;

import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;

public class TriangleCreator {		

	public Triangle createTriangle(List<Double> list){		
		Point a = new Point(list.get(0),list.get(1));
		Point b = new Point(list.get(2),list.get(3));
		Point c =new Point(list.get(4),list.get(5));		
		Triangle t = new Triangle(a,b,c);
		return t;
	}

}
