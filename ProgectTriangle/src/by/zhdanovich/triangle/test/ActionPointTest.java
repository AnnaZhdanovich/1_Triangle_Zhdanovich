package by.zhdanovich.triangle.test;
import java.io.IOException;

import java.util.List;

import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

import by.zhdanovich.triangle.action.ActionPoint;
import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;


public class ActionPointTest {
	public static Point a;
	public static Point b;
	public static Point c;
	public static Triangle t;
	public static ActionPoint action;
	
	@BeforeClass
	
	public static void init(){	
		a = new Point(1.0, -1.0);
		 b = new Point(5.0, -2.);
		 c = new Point(1.0, -3.0);
		 t= new Triangle(a,b,c);
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
