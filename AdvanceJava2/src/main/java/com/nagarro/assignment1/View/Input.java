package main.java.com.nagarro.assignment1.View;
import java.util.Scanner;

import main.java.com.nagarro.assignment1.Model.RequiredData;

public class Input {

	/**
	 * To get Required Input From User
	 * @return
	 */
	public static RequiredData input() {
		String str;
		boolean flag;
		
		RequiredData obj = new RequiredData();
		
		//Get Departure Location
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Departure Location : ");
		do {
			str=sc.nextLine();
			flag=Input_Validation.location_Validate(str);
		}while(flag!=true);
		obj.setDep_Loc(str.toUpperCase());
		
		//Get Arrival Location
		System.out.println("Enter Arrival Location : ");
		do {
			str=sc.nextLine();
			flag=Input_Validation.location_Validate(str);
		}while(flag!=true);
		obj.setArr_Loc(str.toUpperCase());
		
		//Get Flight Date
		System.out.println("Enter Flight Date : ");
		do {
			str=sc.nextLine();
			flag=Input_Validation.Date_Validate(str);
		}while(flag!=true);
		obj.setFight_Date(str);
		
		//Get Flight Class
		System.out.println("Enter Flight class : ");
		do {
			str=sc.nextLine();
			flag=Input_Validation.Class_Validate(str);
		}while(flag!=true);
		obj.setFlight_Class(str.toUpperCase());
		
		//Get Preference For Output
		System.out.println("Enter Output Preference : ");
		do {
			str=sc.nextLine();
			flag=Input_Validation.OutputPref_Validate(str);
		}while(flag!=true);
		obj.setOutput_Pref(str.toLowerCase());

		sc.close();
		return obj;
	
	}
	
}
