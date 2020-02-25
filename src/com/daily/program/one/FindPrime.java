package com.daily.program.one;

import java.util.Scanner;

public class FindPrime {

	public static void main(String[] args) {
		int num;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		num = sc.nextInt();
		sc.close();
		for (int i = 2; i <= num / 2; i++) {
			int temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("The entered number is Prime..");
		} else {
			System.out.println("Not a prime number..");
		}
	}
}
