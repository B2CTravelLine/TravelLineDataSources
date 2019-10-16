package com.virtusa.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.virtusa.controller.AdminController;
import com.virtusa.model.AdminLoginModel;
import java.util.*;

public class AdminLoginView {

	public void mainAdminView() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("=======Admin View======");
		
		
		System.out.println("enter username");
		String username=sc.next();
		System.out.println("enter password");
		String Password=sc.next();
		
		AdminController adminController=new AdminController();
		adminController.verification(username,Password);
		
	}

	
}
