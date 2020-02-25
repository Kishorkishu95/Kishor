/**
 * Finding Factorial of a number
 * 1. First method- Using Recursive method
 * 2. 2nd method- Using Iterative method
 * */
package com.daily.program.one;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(factorialOfNumber(0));
		System.out.println(factIterative(4));
	}
	
	private static int factorialOfNumber(int num) {
		if(num ==0) {
			return 1;
		}
		return num * factorialOfNumber(num-1);
	}
	
	private static int factIterative(int number) {
		if(number == 0) {
			return 1;
		}
		int fact =1;
		for(int i=1; i<= number; i++) {
			fact= fact*i;
		}
		return fact;
	}	
}
