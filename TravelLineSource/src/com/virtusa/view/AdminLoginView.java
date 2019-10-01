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
		String adminName=sc.next();
		System.out.println("enter password");
		String adminPassword=sc.next();
		
		AdminController adminController=new AdminController();
		adminController.Verification(adminName,adminPassword);
		
	}
}
