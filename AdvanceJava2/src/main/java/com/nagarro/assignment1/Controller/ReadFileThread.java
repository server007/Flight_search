package main.java.com.nagarro.assignment1.Controller;

import java.io.IOException;
import java.util.ArrayList;

import main.java.com.nagarro.assignment1.Model.*;
import main.java.com.nagarro.assignment1.View.*;

public class ReadFileThread extends Thread{
	
	
	RequiredData object=Input.input();
	public String preference=object.getOutput_Pref();
	
	/**
	 * override run method to read data from all the files and store them in proper format.
	 */
	@Override
	public void run() {
		//public static 
		ArrayList<String> arr=new ArrayList<String>();
		ArrayList<String> arr2=new ArrayList<String>();
		
		//Array to store different values from a string of data
		String[] str=new String[9];
		ReadCSV obj=new ReadCSV();
		try {
			
			//arr is an arralist object to store all data in ArrayList<String> format
			arr=obj.Read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] date=object.getFlight_Date().split("-");
		String clas=object.getFlight_Class();
		
		for(String st:arr) {
			str=st.split(",");	
			
			//To refine the data by date requirements
			String[] date2=str[3].split("-");
			int y1=Integer.parseInt(date[2]);
			int y2=Integer.parseInt(date2[2]);
			int m1=Integer.parseInt(date[1]);
			int m2=Integer.parseInt(date2[1]);
			int d1=Integer.parseInt(date[0]);
			int d2=Integer.parseInt(date2[0]);
			
			//To check which information matches the user requirements
			if((str[1].equals(object.getDep_Loc()))&&(str[2].equals(object.getArr_Loc()))&&
				((y1<y2)||((y1==y2)&&((m1<m2)||((m1==m2)&&(d1<=d2)))))&&(str[8].contains(clas))) {
			arr2.add(st);
			}
		}
		try {
			
			//Calling output function
			Output.output(arr2,preference,clas);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
