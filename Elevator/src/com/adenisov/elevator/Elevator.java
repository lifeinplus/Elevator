package com.adenisov.elevator;

import java.util.Arrays;

public class Elevator {

	private static final int MIN_INDEX = 0;
	private static final int MAX_INDEX = 1;
	
	private int[] results;
	private int capacity;

	public Elevator() {
		results = new int[2];
	}

	private boolean isCapacityErorr(int[] out, int[] in) {
		
		int max = capacity;
		int min = 0;
		
		for (int i = 0; i < out.length; i++) {
			
			max = max - out[i] + in[i];
			if (max > capacity) max = capacity;
			
			min = min - out[i];
			if (min < 0) min = 0;
			min = min + in[i];
			
			if (min > max) {
				return true;
			}
			
			if ((out[i] > capacity) || (in[i] > capacity)) {
				return true;
			} 
		}
		
		return false;
	}

	private String searchMinMaxCapacity(int[] out, int[] in) {
		
		int max = 0;
		int min = 0;
		int tempMin = 0;
		int tempMax = 0;
		
		for (int i = 0; i < out.length; i++) {
			if (i == 0) {
				min = out[i];
				max = capacity;
			} else {
				tempMin += out[i] - in[i-1];
			}
			
			int temp = out[i] - in[i];
			if (temp < 0) tempMax += temp;
		}
		
		if (tempMin > 0) min += tempMin;
		if (tempMax < 0) max += tempMax;
		if (max < min) max = min;
		
		results[MIN_INDEX] = min;
		results[MAX_INDEX] = max;
		
		return Arrays.toString(results);
	}

	public String runElevator(int[] out, int[] in) {
		
		if (isCapacityErorr(out, in)) {
			return Arrays.toString(new int[2]);
		}
		
		String minMaxCapacity = searchMinMaxCapacity(out, in);
		
		return minMaxCapacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
