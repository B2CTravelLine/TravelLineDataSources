package com.virtusa.validation;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.model.AddServicesModel;

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
		@SuppressWarnings("unused")
		public boolean validNumber(int busNo) {
		// TODO Auto-generated method stub
			boolean result=false;
	        String data=String.valueOf(busNo);
	        if(data.matches(".*[0-9]")) {
	            return true;
	        }
	        else
	        {
	        	return false;
	        }
		}

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
		            { result=true;}
		            else if(!(alphabets.contains(ch)))
		                {result=false;}
		         }        
		       
		       
		        return result;
		   }


}

		

