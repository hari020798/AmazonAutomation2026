package com.Programs;

import java.util.HashMap;

public class RepeatedChars {
	
	
	public static void main(String[] args) {
		String str = "ABBASCCC";
		char[] str2 = str.toCharArray();

		HashMap<Character, Integer > map = new HashMap<>();
		for(int i = 0; i<str2.length; i++) {
			
			if(map.containsKey(str2[i])){ 
				Integer count = map.get(str2[i]);
				map.put(str2[i], count+1);


			}
			
			
			else {
				map.put( str2[i], 1);


			}
			
		}
		System.out.println(map);
		
		
	}

}
