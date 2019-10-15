package com.virtusa.validation;

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

		public boolean validString(String busName) {
			// TODO Auto-generated method stub
			return false;
		}

		
}
