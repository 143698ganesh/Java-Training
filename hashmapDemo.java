package com.example.demo;

import java.util.HashMap;
import java.util.Map.Entry;

public class hashmapDemo {
	
	public static void main(String args[]) {
		  
	      
		HashMap<Integer, String> employee = new HashMap<>();
	  employee.put(100, "ganesh");
	  employee.put(102, "aneesh");
	  employee.put(103, "sanesh");
	  employee.put(104, "sujith");

	  
	  for(Entry<Integer, String> entry: employee.entrySet()) {

	      if(entry.getValue().startsWith("s")) {
	        System.out.println(entry.getValue());
	      }
	    }
	  }
}
