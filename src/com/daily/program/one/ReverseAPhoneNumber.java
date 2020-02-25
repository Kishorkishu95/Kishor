/**
 * Reverse an Integer number
 * Input:  ph
(1) Initialize rev_num = 0
(2) Loop while ph > 0
     (a) rev_num = rev_num*10 + ph%10;
     (b) ph = ph / 10;
(3) Return rev_num
(4) Time complexity : O(log(n))
 * */
package com.daily.program.one;

public class ReverseAPhoneNumber {

	public static void main(String[] args) {
		int ph = 889286128;
		System.out.println("Reversed version of a number is : " + reverseNumber(ph));
	}

	private static int reverseNumber(int ph) {
		int rev_num = 0;
		while (ph > 0) {
			rev_num = (rev_num * 10) + ph % 10;
			ph = ph / 10;
		}
		return rev_num;
	}
}
