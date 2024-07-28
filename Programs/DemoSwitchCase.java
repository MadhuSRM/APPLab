package com.srm;

import java.util.Scanner;

public class DemoSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		String day = sc.nextLine();
		display(day);
		sc.close();
	}

	public static void display(String day) {
		int ticketPrice = 0;
		switch(day) {
		case "Sunday":
			ticketPrice = 210;
			break;
		case "Monday":
			ticketPrice = 195;
			break;
		case "Tuesday":
			ticketPrice = 190;
			break;
		case "wednesday":
			ticketPrice = 150;
			break;
		case "Thursday":
			ticketPrice = 180;
			break;
		case "Friday":
			ticketPrice = 200;
			break;
		case "Saturday":
			ticketPrice = 205;
			break;
			default:
				throw new IllegalArgumentException("Invalid day of the week: " + day);
		}
		System.out.println("Ticket Price = Rs."+ticketPrice);
	}
}
