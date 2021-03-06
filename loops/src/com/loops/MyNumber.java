package com.loops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {

		if (number < 2) {
			return false;
		}

		for (int i = 2; i <= (number - 1); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		int ans = 0;
		for (int i = 1; i <= number; i++) {
			ans += i;
		}
		return ans;
	}

	public int sumDiv() {
		int ans = 0;
		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				ans += i;
			}
		}
		return ans;
	}

	public void printTriangle() {
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
