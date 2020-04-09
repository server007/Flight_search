package main.java.com.nagarro.assignment1.View;

import java.util.ArrayList;

public class Display {
	
	/**
	 * Print result
	 * 
	 * @param arr
	 * @param clas
	 */
	public void display(ArrayList<String> arr,String clas) {
	
		//When Departure or Arrival Location is not Correct
		if(arr.size()==0) {
			System.out.println("\nSorry but no Flight is available matching your Search !\n");
		}
		
		//Print result on console in valid format
		else {
			System.out.println(String.format("||%-13s|","  Flight No.")+""+
					String.format("|%-13s|","  Departure")+""+
					String.format("|%-13s|","   Arrival")+""+
					String.format("|%-13s|"," Flight Time")+""+
					String.format("|%-13s|","  Duration")+""+
					String.format("|%-10s|","   Fare")+""+
					String.format("|%-16s|"," Seat Available")+""+
					String.format("|%-10s||","  Class"));
			for(String st:arr) {
				String[] str=st.split(",");
				if(clas.equals("B")) {
					str[6]=String.valueOf(Math.round((Integer.parseInt(str[6]))*(140))/100);
				}
				System.out.println(String.format("||%-13s|","    "+str[0])+""+
						String.format("|%-13s|","     "+str[1])+""+
						String.format("|%-13s|","     "+str[2])+""+
						String.format("|%-13s|","    "+str[4])+""+
						String.format("|%-13s|","    "+str[5])+""+
						String.format("|%-10s|","   "+str[6])+""+
						String.format("|%-16s|","        "+str[7])+""+
						String.format("|%-10s||","    "+str[8]));
			}
		}
	}
	
	/** 
	 * Separate two results
	 *
	 * @param pref
	 */
	public void displayOther(String pref) {
		System.out.println("\n\n");
		System.out.print("********************************************");
		System.out.print(" Flight Details Sorted By "+pref+" ");
		System.out.println("********************************************\n");		
	}
}
