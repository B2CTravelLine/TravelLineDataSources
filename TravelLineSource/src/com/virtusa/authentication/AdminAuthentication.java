package com.virtusa.authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AdminAuthentication {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username=null;
		  String password=null;
		
		System.out.println();
		Scanner scanner1=new Scanner(System.in);
		
		
		System.out.println("Enter UserName:");
		String username1=scanner1.next();
		
		System.out.print("Enter Password:");
		String password1=scanner1.next();
	boolean result=Verification(username1,password1);
		  if(result)
			  System.out.print("valid user");	
		  else
			  System.out.print("INvalid user"); 
	      }
	
	
	
	public static boolean Verification(String username,String password) {

		String username1=null;
		String password1=null;
		
		
		try {
	        Class.forName("oracle.jdbc.driver.OracleDriver");
	     } catch(ClassNotFoundException e) {
	        System.out.println("Class not found "+ e);
	     }
		

	      try {
	         Connection con = DriverManager.getConnection(
	        		 "jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");   
	         Statement stmt = con.createStatement();
	         ResultSet rs;
			     
	        	 rs = stmt.executeQuery("SELECT FIRSTNAME,LASTNAME FROM Employees ");
			
		      while (rs.next()) {
		          
		             username1 = rs.getString(1);
		            password1 = rs.getString(2);

		         	 System.out.println(username1+"is"+password1+"  -----");
		         }
		      if((username1.equals(username))&&(password1.equals(password)))
		         {
			         System.out.println("User Authentication Successfull ");}

		      
			
	      }catch(SQLException e) {
		         System.out.println("SQL exception occured" + e);
	      }
		return true;
	}

}
