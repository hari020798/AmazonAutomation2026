package com.Top30DSAInterviewQuestions;

import java.util.HashMap;

public class Anagram {

	private boolean anagram() {

		String str1 = "caat";
		String str2 = "taac";

		char[] ca1 = str1.toCharArray();
		char[] ca2 = str2.toCharArray();

		HashMap<Character, Integer> hs = new HashMap<>();

		for (int i = 0; i < ca1.length; i++) {

			if (hs.containsKey(ca1[i])) {
				Integer count1 = hs.get(ca1[i]);

				hs.put(ca1[i], count1 + 1);
			} else {
				hs.put(ca1[i], 1);

			}
		}

		for (int i = 0; i < ca2.length; i++) {

			if (!hs.containsKey(ca2[i])) {
				System.out.println("Not an Anagram - Characther Mismatch");
			}

			else if (hs.containsKey(ca2[i])) {
				Integer count2 = hs.get(ca2[i]);
				hs.put(ca2[i], count2 - 1);

			}

		}

		for (Integer value : hs.values()) {

			if (value != 0) {

				return false;
			}
		}
		System.out.println(hs);
		return true;

	}

	private boolean AnagramMethod2() {
		String str1 = "caat";
		String str2 = "taac";

		int[] count = new int[26];

		char[] str3 = str1.toLowerCase().toCharArray();
		char[] str4 = str2.toLowerCase().toCharArray();

		for (int i = 0; i < str3.length; i++) {

			count[str3[i] - 'a']++;
		}

		for (int j = 0; j < str4.length; j++) {

			count[str4[j] - 'a']--;
		}

		for (int a : count) {

			if (a != 0) {
				return false;
			}

		}
		if (true) {
			System.out.println("Anagram");
		}

		return true;

	}

	public static void main(String[] args) {
		Anagram st = new Anagram();
		System.out.println(st.AnagramMethod2());
	}
}
