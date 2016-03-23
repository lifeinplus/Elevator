package com.adenisov.elevator;

public class Solver {

	public static void main(String[] args) {
		
		Elevator elevator = new Elevator();
		
		elevator.setCapacity(2);
		int[] out = { 0, 1 };
		int[] in = { 1, 0 };
		
		String result = elevator.runElevator(out, in);
		System.out.println(result);
	}

}
