package by.zhdanovich.triangle.test;
import java.io.IOException;

import java.util.List;

import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import by.zhdanovich.triangle.action.ActionPoint;
import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;
import by.zhdanovich.triangle.parser.ParserText;

public class ActionPointTest {
	private static ActionPoint action;
	private static ParserText parser;
	private static List<Double> array;
	private static Point a;
	private static Point b;
	private static Point c;
	private static Triangle t;
	
	@BeforeClass
	public static void init() throws IOException{
	parser = new ParserText();
	array = parser.parseFromFile();
	a = new Point(array.get(0), array.get(1));
	b = new Point(array.get(2), array.get(3));
	c = new Point(array.get(4), array.get(5));	
	t = new Triangle(a,b,c);	
	action = new ActionPoint();
	}
	
	
	@Test
	public void areaTest(){
		 double expected = 12.0; 
		 double actual = action.area(t);  		 
		 Assert.assertEquals(expected, actual, 0.01); 
	}
	
	@Test
	public void perimeterTest(){
		double expected = 16.398147902301346; 
		 double actual = action.perimeter(t);  
		 Assert.assertEquals(expected, actual, 0.01);  
		
	}
	@Test
	public void checkPointLineTest(){
		boolean actual = action.checkPointLine(a, b, c);
		Assert.assertTrue("test failed", actual);
	}
	
	@Test
	public void checkRectangularTest(){		
		boolean actual = action.checkRectangular(t);
		Assert.assertFalse("test failed", actual);
		
}
	@Test
	public void createSideTest(){
		 double expected = 4.24; 
		 double actual = action.createSide(a, b);  		 
		 Assert.assertEquals(expected, actual, 0.01); 
	}
}
