package com.Programs;

public class Regrex {

	private void ReverseStringwithSpaces(String str) {

		String sd = "";

		char[] str2 = str.replaceAll(" ", "").toCharArray();

		for (int i = str2.length - 1; i >= 0; i--) {
			sd = sd + str2[i];

		}

		System.out.println(sd);

	}

	private void RemoveSpecialCharacter(String str) {

		String replaceAll = str.replaceAll("[\\d\\W]", "");
		System.out.println(replaceAll);

	}

	public static void main(String[] args) {
		Regrex rx = new Regrex();
//		rx.ReverseStringwithSpaces("H A R I");
		rx.RemoveSpecialCharacter("Hari92@239&^*");
	}

}
