package com.dominionconsulting;

public class PrimeNumberService {
	public boolean isPrime(int number) {
		boolean isPrime = true;
		
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		
		return isPrime;
	}
}
