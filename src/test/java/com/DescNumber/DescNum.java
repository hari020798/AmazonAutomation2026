package com.DescNumber;

public class DescNum {
	
	
	private void DesNum() {
		
		
		int [] num = {1,2,3,4,5};
		
		int s = 0;
		
		for (int i = 0; i < num.length; i++) {

			for (int j = i+1; j < num.length; j++) {

				if (num[j] > num[i]) {
					s = num[i];
					num[i] = num[j];
					num[j] = s;

				}

			}

		}
		for(int nu : num) {
			System.out.print(nu);
		}

	}
	
	public static void main(String[] args) {
		DescNum dn = new DescNum();
		dn.DesNum();
	}

}
