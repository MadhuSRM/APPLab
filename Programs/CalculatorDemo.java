/*Static Polymorphism*/

package com.srm;

public class CalculatorDemo {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("Addition of two integers:"+cal.add(12, 18));
		System.out.println("Addition of three integers:"+cal.add(12, 18, 25));
		System.out.println("Addition of two doubles:"+cal.add(12.80, 87.48));
		System.out.println("Addition of one integer and one double:"+cal.add(12, 87.48));
		System.out.println("Addition of one double and one integer:"+cal.add(13.44, 81));
	}

}

class Calculator{
	public int add(int a, int b) {
		return a+b;
	}
	
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public double add(double a, double b) {
		return a+b;
	}
	
	public double add(int a, double b) {
		return a+b;
	}
	
	public double add(double a, int b) {
		return a+b;
	}
	
}
