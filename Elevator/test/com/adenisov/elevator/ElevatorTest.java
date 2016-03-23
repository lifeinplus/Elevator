package com.adenisov.elevator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {

	Elevator elevator;
	
	@Before
	public void before() {
		elevator = new Elevator();
	}
	
	@After
	public void after() {
		elevator = null;
	}
	
	@Test
	public void testRunElevatorZeroOnes() {
		
		elevator.setCapacity(1);
		int[] out = { 0, 0 };
		int[] in = { 0, 0 };
		
		String expected = "[0, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorOneOneTopLeft() {

		elevator.setCapacity(1);
		int[] out = { 1, 0 };
		int[] in = { 0, 0 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorOneOneTopRight() {

		elevator.setCapacity(1);
		int[] out = { 0, 1 };
		int[] in = { 0, 0 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorOneOneBottomRight() {

		elevator.setCapacity(1);
		int[] out = { 0, 0 };
		int[] in = { 0, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorOneOneBottomLeft() {

		elevator.setCapacity(1);
		int[] out = { 0, 0 };
		int[] in = { 1, 0 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorTwoOnesTopCapacityOne() {

		elevator.setCapacity(1);
		int[] out = { 1, 1 };
		int[] in = { 0, 0 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorTwoOnesTopCapacityTwo() {
		
		elevator.setCapacity(2);
		int[] out = { 1, 1 };
		int[] in = { 0, 0 };
		
		String expected = "[2, 2]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorTwoOnesRight() {

		elevator.setCapacity(1);
		int[] out = { 0, 1 };
		int[] in = { 0, 1 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorTwoOnesBottomCapacityOne() {

		elevator.setCapacity(1);
		int[] out = { 0, 0 };
		int[] in = { 1, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorTwoOnesBottomCapacityTwo() {
		
		elevator.setCapacity(2);
		int[] out = { 0, 0 };
		int[] in = { 1, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorTwoOnesLeft() {

		elevator.setCapacity(1);
		int[] out = { 1, 0 };
		int[] in = { 1, 0 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorTwoOnesTopLeftBottomRight() {

		elevator.setCapacity(1);
		int[] out = { 1, 0 };
		int[] in = { 0, 1 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorTwoOnesTopRightBottomLeft() {

		elevator.setCapacity(1);
		int[] out = { 0, 1 };
		int[] in = { 1, 0 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorThreeOnesBottomRight() {

		elevator.setCapacity(1);
		int[] out = { 0, 1 };
		int[] in = { 1, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorThreeOnesBottomLeftCapacityOne() {

		elevator.setCapacity(1);
		int[] out = { 1, 0 };
		int[] in = { 1, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorThreeOnesBottomLeftCapacityTwo() {
		
		elevator.setCapacity(2);
		int[] out = { 1, 0 };
		int[] in = { 1, 1 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorThreeOnesTopLeft() {

		elevator.setCapacity(1);
		int[] out = { 1, 1 };
		int[] in = { 1, 0 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorThreeOnesTopRightCapacityOne() {

		elevator.setCapacity(1);
		int[] out = { 1, 1 };
		int[] in = { 0, 1 };
		
		String expected = "[0, 0]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorThreeOnesTopRightCapacityTwo() {
		
		elevator.setCapacity(2);
		int[] out = { 1, 1 };
		int[] in = { 0, 1 };
		
		String expected = "[2, 2]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorFourOnes() {

		elevator.setCapacity(1);
		int[] out = { 1, 1 };
		int[] in = { 1, 1 };
		
		String expected = "[1, 1]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testRunElevatorCapacityTen1() {
		
		elevator.setCapacity(10);
		int[] out = { 3, 1, 4 };
		int[] in = { 4, 2, 1 };
		
		String expected = "[3, 8]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorCapacityTen2() {
		
		elevator.setCapacity(10);
		int[] out = { 3, 4, 4 };
		int[] in = { 5, 2, 1 };
		
		String expected = "[4, 8]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorCapacityTen3() {
		
		elevator.setCapacity(10);
		int[] out = { 3, 4, 4 };
		int[] in = { 1, 2, 1 };
		
		String expected = "[8, 10]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void testRunElevatorCapacityTen4() {
		
		elevator.setCapacity(10);
		int[] out = { 3, 1, 4 };
		int[] in = { 4, 2, 5 };
		
		String expected = "[3, 7]";
		String actual = elevator.runElevator(out, in);
		
		assertEquals(expected, actual);
	}

}
