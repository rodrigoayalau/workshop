package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class APICollection {

	public static void main(String[] args) {

		List<String> myList = new ArrayList<String> ();
		myList.add("Monday");
		myList.add("Tuesday");
		myList.add("Wednesday");
		myList.add("Thursday");
		myList.add("Friday");
		
		printCollections(myList);		
		
		Set<String> setList = new HashSet<String>();
		setList.add("Monday");
		setList.add("Tuesday");
		setList.add("Wednesday");
		setList.add("Thursday");
		setList.add("Friday");
		setList.add("Friday");
		
		printCollections(setList);
		
		Map<String, String> mapList = new HashMap<String, String>();
		mapList.put("Day1", "Monday");
		mapList.put("Day2", "Tuesday");
		mapList.put("Day3", "Wednesday");
		mapList.put("Day4", "Thursday");
		mapList.put("Day5", "Friday");
		
		System.out.println(mapList.containsKey("Day1"));
		String mapElement = mapList.get("Day1");
		System.out.println(mapElement);
		
	}
	
	public static void printCollections(Collection<String> collection) {
		collection.forEach(elementL -> {
			System.out.println("Day: " + elementL);
		});
		System.out.println("- - - - - - - - - -");
	}

}
