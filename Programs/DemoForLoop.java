package com.srm;
import java.util.*;

public class DemoForLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Factorial="+findFactorial(n));
		sc.close();
	}
	
	public static long findFactorial(int n) {
		long fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}

}
