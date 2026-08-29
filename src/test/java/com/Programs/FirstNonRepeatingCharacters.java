package com.Programs;

import java.util.HashMap;

public class FirstNonRepeatingCharacters {

	private void FNRC() {

		String r = "DDZZYYAAUPP";
		char[] arr = r.toCharArray();

		HashMap<Character, Integer> str = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			if (str.containsKey(arr[i])) {
				str.put(arr[i], str.get(arr[i]) + 1);

			}

			else {

				str.put(arr[i], 1);
			}

		}

		for (char value : arr) {

			if (str.get(value) == 1) {

				System.out.println(value);
				break;
			}

		}

	}

	public static void main(String[] args) {
		FirstNonRepeatingCharacters fn = new FirstNonRepeatingCharacters();
		fn.FNRC();
	}
}
