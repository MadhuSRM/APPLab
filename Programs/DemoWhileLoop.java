package com.srm;

import java.util.Scanner;

public class DemoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int m = sc.nextInt();
		System.out.println("Enter the second number");
		int n = sc.nextInt();
		System.out.println("GCD ="+computeGcd(m,n));
		sc.close();
	}
	
	public static int computeGcd(int a, int b) {
		int temp;
		while(b != 0) {
			temp = a;
			a = b;
			b = temp % b;
		}
		return a;
	}

}
