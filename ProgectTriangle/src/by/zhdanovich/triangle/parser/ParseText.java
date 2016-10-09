package by.zhdanovich.triangle.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.zhdanovich.triangle.exception.WrongCoordinateException;

public class ParseText {
	
	public final String REG1= "(\\s*)(;)(\\s*)";
	public final String REG2= "(^-{0,1})(\\d+)(\\.{0,1})(\\d*$)";
	public List<Double> parseText(String str) throws WrongCoordinateException{
		 
		
	 String[] numbers = str.split(REG1);	 
	   if (numbers.length<5){	
		   throw new WrongCoordinateException();  
		   }
	   	   List<Double> list = new ArrayList<Double>();
		   for (int i = 0; i<6; i++ ){
			   Pattern p = Pattern.compile(REG2);
				Matcher m = p.matcher(numbers[i]);
			   if (m.matches()){	   
			   		list.add(Double.parseDouble(numbers[i])); }			   
			   		else{throw new WrongCoordinateException(); 
			   		}
		   }
		   
		    return list;
		  }
	   }
		
	   

