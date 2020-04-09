package main.java.com.nagarro.assignment1.View;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import main.java.com.nagarro.assignment1.View.Display;

public class Output {
	
	/**
	 * To Give Output.
	 * 
	 * @param arr
	 * @param pref
	 * @param clas
	 * @throws IOException
	 * 
	 */
	public static void output(ArrayList<String> arr,String pref,String clas) throws IOException{
		String[] str=new String[9];
		Map<String,Integer> map=new HashMap<>();
		Map<String,Float> map2=new HashMap<>();
		
		//Create Display class object to call function display.
		Display disp=new Display();
		
		for(String st:arr) {
			str=st.split(",");
			map.put(st,Integer.valueOf(str[6]));
			}
		
		//Sort the map to sort the data by Flight price
		Map<String,Integer> sortedMap = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1, LinkedHashMap::new));
		
		//Use Entry interface to iterate over all data
		Set<Entry<String,Integer>> mappings = sortedMap.entrySet();
		
		//Create arraylist if preference is only fare
		if(pref.equalsIgnoreCase("fare")) {
			ArrayList<String> array=new ArrayList<>();
			for(Entry< String,Integer> mapping : mappings)
			{
				array.add(mapping.getKey());
			}
			disp.displayOther("fare");
			disp.display(array,clas);
		}
		
		//Create arraylist if preference is both
		else { 
			for(Entry<String, Integer> mapping : mappings)
			{
				str=mapping.getKey().split(",");
				map2.put(mapping.getKey(),Float.valueOf(str[5]));

			}
			
			//Sort the map to sort the data by Flight price
			Map<String,Float> sortedMap2 = map2.entrySet().stream().sorted(Entry.comparingByValue())
					.collect(Collectors.toMap(Entry::getKey, Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
			Set<Entry<String,Float>> mappings2 = sortedMap2.entrySet();
			
			//Create arraylist for sorted by fare if preference is both
			ArrayList<String> array=new ArrayList<>();
			for(Entry< String,Integer> mapping : mappings)
			{
				array.add(mapping.getKey());
			}
			disp.displayOther("fare");
			disp.display(array,clas);

			//Create arraylist for sorted by Duration if preference is both
			ArrayList<String> array2=new ArrayList<>();
			for(Entry< String,Float> mapping2 : mappings2)
			{
				array2.add(mapping2.getKey());
			}
			disp.displayOther("Duration");
			disp.display(array2,clas);
		}
	}
}