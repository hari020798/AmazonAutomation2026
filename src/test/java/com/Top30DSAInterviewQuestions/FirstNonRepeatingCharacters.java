package com.Top30DSAInterviewQuestions;

import java.util.HashMap;

public class FirstNonRepeatingCharacters {
	
	private void FNRC() {

		
		String r = "DDZZYA";
		String  p  = "ZZDYAD";
		char[] prr = p.toCharArray();
		char[] arr = r.toCharArray();
		
		
		HashMap<Character, Integer> str = new HashMap<>();
		
		for(int i = 0; i< arr.length; i++) { // 
			
			if(str.containsKey(arr[i])) { 
				Integer integer = str.get(arr[i]); // 1 

				str.put(arr[i], integer +1 );
				
				
			}
		
			
			else {
			   str.put(arr[i], 1);   //d -1
			}
					
		
		
			
			
			
		
					
			
			
		}
		

		
		
		
		for(int j = 0; j< arr.length; j++) { // 
			System.out.println("Str.Get[: " + arr[j] + " ]: " + str.get(arr[j]));
			
			if (str.get(arr[j]) == 1) {
				
				System.out.println(arr[j]);
				return;
			}
		}
		
		
			
			
		
		
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		FirstNonRepeatingCharacters fc = new FirstNonRepeatingCharacters();
		fc.FNRC();
	}

	
	
}
