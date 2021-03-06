package by.zhdanovich.triangle.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.zhdanovich.triangle.exception.WrongCoordinateException;

public class ParserText {	
	public final String DELIMITER= "\\s*;\\s*";
	public final String REGEXP= "^-{0,1}\\d+\\.{0,1}\\d*$";
public List<Double> parseText(String str) throws WrongCoordinateException{		
 String[] numbers = str.split(DELIMITER);	 
	if (numbers.length < 6){	
	throw new WrongCoordinateException("Not enough data");  
	}
	List<Double> list = new ArrayList<Double>();
    for (int i = 0; i < 6; i++ ){
	Pattern p = Pattern.compile(REGEXP);
	Matcher m = p.matcher(numbers[i]);
	if (m.matches()){	   
	 list.add(Double.parseDouble(numbers[i])); }			   
	else{
		throw new WrongCoordinateException("Input data is not correct"); 
	}
    } 
	 return list;
	}
 }
		
	   

