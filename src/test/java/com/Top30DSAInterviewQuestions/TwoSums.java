package com.Top30DSAInterviewQuestions;

import java.util.HashMap;

import com.graphbuilder.struc.Stack;

public class TwoSums {

	private void twoSums(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {

					System.out.println("Sum1: " + arr[i] + " Sum2: " + arr[j]+ " = " + target);
				}
			}

		}

	}
	
	private void twoSumsUsingHashmap(int[] arr, int target) {
		
		HashMap<Integer, Integer> hs = new HashMap<>();
		
		for(int i = 0; i< arr.length; i ++) {
			
			int complement = target - arr[i];
		
			if (hs.containsKey(complement)) {
				System.out.println(arr[i] + " " +complement);
				return;
			}
			
			else {
				
				hs.put(arr[i], i);
			}
		}

	}
	
	
	private boolean ValidParentheses(char [] ch) {
		Stack st = new Stack();
		
		for(int i = 0; i< ch.length; i++ ) {
			if ( (ch[i] == '(' ) || (ch[i] == '[') || (ch[i] == '{')){
				
				st.push(ch[i]);
				System.out.println(st);
			}
			
			else if(st.isEmpty()) {
				
				return false;
			}
			
			
			
			
		}
   /*
     Stack st = new Stack();
     st.push('(');
     st.peek();
     System.out.println(st.peek());
     st.push('{');
     System.out.println(st.peek());
     st.push('[');
     System.out.println(st.peek());
     st.pop();
     System.out.println(st);
     st.pop();
     System.out.println(st);
     st.pop();
     System.out.println(st);
     System.out.println(st.isEmpty()); */
		return false;
		
		






	
	}
	
	
	public static void main(String[] args) {
		TwoSums ts = new TwoSums();
//		ts.twoSums(new int [] {1,2,3,5,6,7}, 13);
//		ts.twoSumsUsingHashmap(new int [] {1,2,3,5,6,7}, 9);
		ts.ValidParentheses(new char [] {'(', '[', '{' });
	}

}
