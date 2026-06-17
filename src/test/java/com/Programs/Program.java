package com.Programs;

import java.util.HashMap;

public class Program {

	public String ReverseString(String revWord) {

		char[] charArray = revWord.toCharArray();
		String st = "";

		for (int i = charArray.length - 1; i >= 0; i--) {

			st = st + charArray[i];

		}

		return st;

	}

	public String RevStringUsingStringBuilder(String st) {

		StringBuilder sb = new StringBuilder(st);
		sb.reverse();
		return sb.toString();

		/*
		 * Multiple threads can access StringBuilder simultaneously, whereas
		 * StringBuffer synchronizes access so modifications happen one thread at a
		 * time." when you use String buffer and String Builder
		 * "For normal string operations like building logs, reports, or payloads, I use StringBuilder. If multiple threads need to modify the same string object, I use StringBuffer."
		 */

	}

	public void revwordSentence(String sent) {

		String[] split = sent.split(" ");
		String revSen = "";

		for (int i = 0; i < split.length; i++) {
			char[] charArray = split[i].toCharArray();
			String revword = "";
			for (int j = charArray.length - 1; j >= 0; j--) {
				revword = revword + charArray[j];
			}

			revSen = revSen + revword + " ";

		}
		System.out.println(revSen);

	}

	public void twoSums(int[] nums, int target) {
		
		HashMap<Integer, Integer> hs = new HashMap<>();
		for(int i =0; i< nums.length; i++) {
			int compliment = target - nums[i];
			
			if(hs.containsKey(compliment)) {
				System.out.println("Sum1: " + compliment + " + Sum2: " + nums[i] + " = " + target);
				
				
			}
			else {
				hs.put(nums[i], i);
			
			
			
			}}
		
		
	}

	
	
	/*
	 * 1st we are using the hashmap. then if we subrating the target with one of the
	 * values in the array, and if the remaining value matches we would find the
	 * answer so we are 1st checking if statement whether the remaining value is
	 * there in the hasmap obiously it will not there 7-1 = 6. so we are adding the
	 * value nums[i] and I to hashmap then goes on 1,2,3,6,5,, During the 6 , and
	 * 7-6 =, we have the 1 value, at that time, we are catching the remainig value
	 * (compliment) and the used value nums[i]
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Program r = new Program();
		String reverseString = r.ReverseString("Hari");
//		r.revwordSentence("My Name Is Billa");
		r.twoSums(new int[] { 1, 2, 3, 6, 5 }, 7);
//		String revStringUsingStringBuilder = r.RevStringUsingStringBuilder("Manoj");
//		System.out.println(revStringUsingStringBuilder);
	}
}
