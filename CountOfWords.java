package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {

	public static void main(String[] args) {
		String str="I am ganesh narayanan. I am attending java training";
		Map<String,Integer>hashMap = new HashMap<>();
		String[] words = str.split(" ");
		for(String word:words) {
			Integer integer=hashMap.get(word);
			if(integer==null)
				hashMap.put(word, 1);
			else {
				hashMap.put(word, integer+1);
				
			}
		}
		System.out.println(hashMap);
	}

}
