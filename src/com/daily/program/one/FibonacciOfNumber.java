package com.daily.program.one;

public class FibonacciOfNumber {

	public static void main(String[] args) {
		System.out.println(fib(10));
	}

	private static int fib(int num) {
		if(num ==0) return 0;
		if(num ==1) return 1;
		if(num ==2) return 1;
		return fib(num-1)+ fib(num-2);
	}

}
