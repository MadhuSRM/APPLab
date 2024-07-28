package com.srm;

import java.util.Scanner;

public class DemoStringManipulation {

	public static void main(String[] args) {
		StringManipulation string = new StringManipulation();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String original = sc.nextLine();
		System.out.println("Reverse of the string is:"+string.reverseString(original));
		System.out.println("Reverse of the string is:"+string.reverseString(new StringBuilder(original)));
		if(string.checkPalindrome(original)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not palindrome");
		}
		sc.close();
	}

}

class StringManipulation{
	String reverseString(String str) {
		char[] input = str.toCharArray();
		char temp;
		int begin = 0;
		int end = input.length - 1;
		while (begin < end) {
			temp = input[begin];
			input[begin] = input[end];
			input[end] = temp;
			begin++;
			end--;
		}
		return new String(input);
	}
	
	String reverseString(StringBuilder str) {
		str.reverse();
		return str.toString();		
	}
	
	boolean checkPalindrome(String original) {
		String reverse = reverseString(original);
		if(original.equals(reverse))
			return true;
		else
			return false;		
	}
}
