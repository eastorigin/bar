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
		
		// Arrays.sort(array);
		
		int[] sortArray = new int[array.length];
		int minValue = array[0];
		for(int i = 0; i < array.length; i++) {
			if(minValue > array[i+1]) {
				minValue = array[i];
				sortArray[i] = minValue;
			}
			System.out.println(sortArray[i]);
		}

	}
}
