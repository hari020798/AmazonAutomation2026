package com.Programs;

import java.util.Arrays;

public class Anagram {
	
	private void Method1() {
		
		String str = "Hari";
		char[] cA = str.toLowerCase().toCharArray();
		
		String str2 = "iraHS";
		char[] lA = str2.toLowerCase().toCharArray();
		
		
		
		int [] count = new int[26];
		
		if(str.length() ==  str2.length()) {
		
		for(int i =0; i<cA.length; i++) {
			count[cA[i] - 97]++;
			count[lA[i] - 97]--;
			
			
		} }
		
		else {
			
			System.out.println("Not an Anagram: Number Mismatch");
			return;
		}
		
		
	    for (int num : count) {
	        if (num != 0) {
	            System.out.println("Not Anagram");
	            return ;
	        }
	    }

	    System.out.println("Anagram");
	}
		
	
	private void Method2() {
		
		String st1 = "Hari";
		String st2 = "iraH";
		
		char[] CA1 = st1.toLowerCase().toCharArray();
	    char[] CA2 = st2.toLowerCase().toCharArray();
	    
	    Arrays.sort(CA1);
	    Arrays.sort(CA2);
	    
	    
	    
	    
	    if (Arrays.equals(CA1, CA2)) {
	    	System.out.println(CA1);
	    	System.out.println(CA2);
	    	
	    	System.out.println("Its a anagram");
			
		} else {
			System.out.println("IT's not a anagram");
		}
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		Anagram as = new Anagram();
		as.Method1();
	}
		
	}


