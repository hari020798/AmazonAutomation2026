package com.Programs;

public class Programs {
	
	
	private void stringBacktoFront() {
		
		String str = "HariiraH";
		char[] str2 = str.toCharArray();
	    
		for(int i =0 ; i < str2.length; i++) {
			
			if(str2[i] !=  str2[str2.length-1-i] ) {
				System.out.println("It's not a palindrome");
				break;
				
				
				
			}
			
		}
		System.out.println("It's a palindrome ");


	}
	
	public static void main(String[] args) {
		Programs pm = new Programs();
		pm.stringBacktoFront();
	}

}
