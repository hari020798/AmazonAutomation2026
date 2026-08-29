package com.Top30DSAInterviewQuestions;

import java.util.HashSet;

public class DuplicateNumber {

	public boolean duplicateNum() {

		int[] num = { 1, 2, 3, 1 };

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < num.length; i++) {

			if (hs.contains(num[i])) {
				System.out.println(num[i]);

				return true;

			}

			else {
				hs.add(num[i]);

			}

		}

		return false;
	
	}

	public static void main(String[] args) {
		DuplicateNumber dn = new DuplicateNumber();
		System.out.println("Duplicate Number found: " + dn.duplicateNum());
	}

}
