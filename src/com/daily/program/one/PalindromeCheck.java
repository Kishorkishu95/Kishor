package com.daily.program.one;

public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "madam";
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed string is : " + reverse);

		if (str.equals(reverse)) {
			System.out.println("Given string is Palindrome..");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
