package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the price of an item.");
		float price = sc.nextFloat();

		System.out.println("Please enter the amount paid.");
		float paid = sc.nextFloat();
		sc.close();

		float totalChange = (paid - price);

		if (paid < price) {
			System.out.println("Not enough.");
		} else if (paid == price) {
			System.out.println("Exact amount.");
		} else {
			System.out.printf("Change: %.2f\n", totalChange);
			
			int dollars = (int) totalChange;
			int cents = (int)((totalChange-(float)dollars)*100);

			int twenties = dollars / 20;
			dollars = dollars % 20;

			int tens = dollars / 10;
			dollars = dollars % 10;

			int fives = dollars / 5;
			dollars = dollars % 5;

			int ones = dollars / 1;
			dollars = dollars % 1;

			int quarters = cents / 25;
			cents = cents % 25;

			int dimes = cents / 10;
			cents = cents % 10;

			int nickels = cents / 5;
			cents = cents % 5;

			int pennies = cents / 1;
			cents = cents % 1;
			

			if (twenties > 0) {
				System.out.println("Twenties: " + twenties);
			}
			if (tens > 0) {
				System.out.println("Tens: " + tens);
			}
			if (fives > 0) {
				System.out.println("Fives: " + fives);
			}
			if (ones > 0) {
				System.out.println("Ones: " + ones);
			}
			if (quarters > 0) {
				System.out.println("Quarters: " + quarters);
			}
			if (dimes > 0) {
				System.out.println("Dimes: " + dimes);
			}
			if (nickels > 0) {
				System.out.println("Nickels: " + nickels);
			}
			if (pennies > 0) {
				System.out.println("Pennies: " + pennies);
			}
		}

	}
}