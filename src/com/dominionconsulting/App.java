package com.dominionconsulting;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		PrimeNumberService service = new PrimeNumberService();
		int input = getUserInput();
		System.out.println(service.isPrime(input));
	}
	
	private static int getUserInput() {
		System.out.print("Please enter an int: ");
		
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();
		int input = Integer.valueOf(inputString);
		return input;
	} 
}
