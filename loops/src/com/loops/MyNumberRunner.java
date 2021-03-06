package com.loops;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(10);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime : " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("Sum upto N : " + sum);

		int sumDiv = number.sumDiv();
		System.out.println("Sum of Divisors of number is : " + sumDiv);

		number.printTriangle();
	}

}
