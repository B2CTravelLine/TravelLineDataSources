package com.virtusa.validation;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author nishithreddyy
 *private int busNo;
	private String busName;
	private String busType;
	private int noOfSeats;
	private int fare;
	private int  boardingId;
 */
public class AddServicesValidation 
{
	public boolean validString(String busName)
	{
	boolean result=false;
	       char chars[]=busName.toCharArray();
	       List<Character> alphabets=new ArrayList<>();
	       for(int i=97;i<=122;i++)
	       {
	           alphabets.add((char)i);
	       }
	       for(char ch:chars)
	       {
	           if(alphabets.contains(ch))
	            result=true;
	           else if(!(alphabets.contains(ch)))
	               result=false;
	        }        
	       return result;
	  }
	@SuppressWarnings("unused")
	public boolean validNumber(String integers) {
	// TODO Auto-generated method stub
	boolean result;
	try {
	int test = Integer.parseInt(integers);
	result=false;
	}catch(NumberFormatException e){
	System.out.println("Enter valid Number");
	result=true;
	}
	return result;
	}
}