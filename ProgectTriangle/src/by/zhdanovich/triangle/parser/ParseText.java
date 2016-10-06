package by.zhdanovich.triangle.parser;

import java.util.ArrayList;
import java.util.List;

import by.zhdanovich.triangle.exception.WrongCoordinateException;

public class ParseText {
	
	public List<Double> parseText(String str) throws WrongCoordinateException{
	 String[] numbers = str.split(";");	 
	   if (numbers.length<5){	
		   throw new WrongCoordinateException();  
		   }
	   else{
		   List<Double> list = new ArrayList<Double>();
		   for (int i = 0; i<6; i++ ){			   
		   list.add(Double.parseDouble(numbers[i])); 
		   }
		   
		    return list;
		  }
	   }
		
	}	  
	   

