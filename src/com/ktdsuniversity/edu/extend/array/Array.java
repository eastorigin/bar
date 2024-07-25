package com.ktdsuniversity.edu.extend.array;

import java.util.Arrays;
import java.util.Random;

public class Array {
	
	public static void main (String [] args) {
		int[] array = new int[30];
		
		Random random = new Random();
		
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100)+1;
			System.out.println(array[i]);
		}
		
		System.out.println("================================");
		

		for(int i = 0; i < array.length - 1; i++) {
			for(int j = 0; j < array.length -1 -i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		// Arrays.sort(array);
	}
}
