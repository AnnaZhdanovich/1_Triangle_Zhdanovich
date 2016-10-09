package by.zhdanovich.triangle.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import by.zhdanovich.triangle.action.ActionTriangle;
import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;


public class ActionPointTest {
	public static Point a;
	public static Point b;
	public static Point c;
	public static Triangle t;
	public static ActionTriangle action;
	
	@BeforeClass	
	public static void init(){	
		a = new Point(1.0, 1.0);
		b = new Point(-2.0, 5.0);
		c = new Point(6.0, 7.0);
		t= new Triangle(a,b,c);
	    action = new ActionTriangle();
	}	
	
	@AfterClass	
	public static void clear(){	
		a =null;
		b = null;
		c = null;
		t= null;
	    action = null;
	}	
	
	@Test
	public void areaTest(){		 
		 double expected = 19.0; 
		 double actual = action.area(t);  		 
		 Assert.assertEquals(expected, actual, 0.01); 
	}
	
	@Test
	public void perimeterTest(){
		double expected = 21.05; 
		 double actual = action.perimeter(t);  
		 Assert.assertEquals(expected, actual, 0.01);  
		
	}
	@Test
	public void checkPointLineTestTrue(){		
		boolean actual = action.checkPointLine(t);
		Assert.assertTrue("test failed", actual);
	}
	
	@Test
	public void checkRectangularTest(){		
		boolean actual = action.checkRectangular(t);
		Assert.assertFalse("test failed", actual);
		
}
	
}
