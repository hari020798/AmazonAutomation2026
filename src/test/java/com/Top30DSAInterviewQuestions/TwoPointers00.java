package com.Top30DSAInterviewQuestions;

public class TwoPointers00 {
	
	private void TwoPoint() {
		
		int [] arr = {3,0,4,3,0,8};
		
		int j = 0;
		
		for(int i = 0 ;i < arr.length; i ++) { // 3  0 4  3  0  8 
			  
			
			
			if (arr[i] != 0) {                  
				arr[j] = arr[i];               // 3, 4, 3, 8
				j++;
				
			}
			
		}
		System.out.println(j);
		
		
   while (j < arr.length) {
	    arr[j] = 0;
	   j++;
   }
   
   
   for(int s : arr) {
	   
	   
	   System.out.print(" " + s);
   }

	}
	
	public static void main(String[] args) {
		TwoPointers00  ts = new TwoPointers00();
		ts.TwoPoint();
	}
}

