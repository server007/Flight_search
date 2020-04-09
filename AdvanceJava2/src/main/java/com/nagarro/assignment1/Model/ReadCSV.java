package main.java.com.nagarro.assignment1.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {

	/**
	 * Function to read data from CSV files
	 * 
	 * @return
	 * @throws IOException
	 */
	public ArrayList<String> Read() throws IOException {
		
		//List to store name of all the files inside a folder
		List<String> results = new ArrayList<String>();
		ArrayList<String> data = new ArrayList<String>();
		
		//It will retrieve an array of File objects for each file in the directory
		String currDir ="C:\\Users\\sarvagyasingh\\eclipse-workspace\\AdvanceJava2\\bin\\main\\java\\com\\nagarro\\assignment1\\Model\\resources";
				
				//System.getProperty("user.dir")+"\\src\\main\\java\\com\\nagarro\\assignment1\\Model\\resources";
		File[] files = new File(currDir).listFiles();
		
		//TO insert all file names from File array to the List
		for (File file : files) {
		    if (file.isFile()) {
		        results.add(file.getName());
		    }
		}
		
		//Storing data in arraylist line by line from all csv files avoiding title
		BufferedReader br=null;
		for (String name : results) {
			String csvfile=currDir+"\\"+name;
			br=new BufferedReader(new FileReader(csvfile));
			String line="";
			while((line =br.readLine()) !=null) {
				if(!(line.contains("FLIGHT"))) {
					data.add(line);
				}
			}
		}
		return data;
	}
}
