package by.zhdanovich.triangle.action;

import by.zhdanovich.triangle.entity.Point;
import by.zhdanovich.triangle.entity.Triangle;

public class ActionTriangle {		
	
	public double perimeter(Triangle t){		
		double p = (createSide(t.getA(),t.getB())+createSide(t.getB(),t.getC())+createSide(t.getC(), t.getA()));
		return p;
	}	
	public double area(Triangle t){	
		double pp = (this.perimeter(t))/2;
		double s = Math.sqrt(pp*(pp-createSide(t.getA(), t.getB()))*(pp-createSide(t.getB(), t.getC()))*(pp-createSide(t.getC(), t.getA())));
		return s;
	}			
	public boolean checkPointLine(Triangle t){
		Point a = t.getA();
		Point b = t.getA();
		Point c = t.getA();
		boolean result=(!((a.getX()-c.getX())*(b.getY()-c.getY())-(b.getX()-c.getX())*((a.getY()-b.getY()))==0));				
		return result;
	}	
	public boolean checkRectangular(Triangle t){		
	    boolean result =((Math.sqrt(createSide(t.getA(),t.getB()))== Math.sqrt(createSide(t.getB(),t.getC()))+ Math.sqrt(createSide(t.getC(),t.getA()))) &&(Math.sqrt(createSide(t.getB(),t.getC()))==Math.sqrt(createSide(t.getA(), t.getB()))+Math.sqrt(createSide(t.getC(), t.getA())))&&(Math.sqrt(createSide(t.getC(), t.getA()))==Math.sqrt(createSide(t.getA(), t.getB()))+Math.sqrt(createSide(t.getB(), t.getC()))));
		return result;
	}	
	 public double createSide(Point a, Point b){
		 double side = Math.sqrt((a.getX() - b.getX()) * (a.getX() - b.getX()) + (a.getY() - b.getY()) * (a.getY() - b.getY()));
		 return side;
	 }
	 

}
