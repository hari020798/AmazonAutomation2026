package com.Programs;

import java.util.Arrays;

public class TwoPointers00 {

    private void moveZeroes() {

        int[] arr = {0, 5, 6, 0, 7};
        
        
        int j = 0;
        
        
        for(int i = 0; i < arr.length; i++) {
        	
        	if(arr[i] != 0) {
        		
        		arr[j] = arr[i];
        		j++;
        	}
        }
        
        
        while(j<arr.length) {
        	
        	arr[j] = 0;
        	j++;
        }
        
        System.out.println(Arrays.toString(arr));

//        // j points to where the next non-zero element should be placed
//        int j = 0;
//
//        // First loop: Move all non-zero elements to the front
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] != 0) {
//
//                arr[j] = arr[i];
//                j++;
//
//            }
//        }
//  System.out.println(Arrays.toString(arr));
//        // Second loop: Fill the remaining positions with zero
//        while (j < arr.length) {
//
//            arr[j] = 0;
//            j++;
//
//        }
//
//        // Print the final array
//        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        TwoPointers00 obj = new TwoPointers00();
        obj.moveZeroes();

    }

}