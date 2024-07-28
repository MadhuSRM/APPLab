package com.srm;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		System.out.println("Sum of first N natural numbers="+computeSum(n));
		System.out.println("Sum of squares of first N natural numbers="+computeSquaresSum(n));
		System.out.println("Sum of fractions ="+computeFractionSum(n));
	}
	
	public static int computeSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static int computeSquaresSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum = sum + (int) Math.pow(i, 2);
		}
		return sum;
	}
	
	public static double computeFractionSum(int n) {
		double sum = 0.0;
		double denom = 0.0;
		for(int i=1;i<=n;i++) {
			denom = (double) 1/i;
			System.out.println(denom);
			sum = sum + denom;
		}
		return sum;
	}

}
