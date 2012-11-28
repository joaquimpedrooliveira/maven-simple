package br.edu.fa7.gcs;

public class NumberFactorial {

	public static int factorial(int number) {
		/*
		 * Factorial of any number is !n. For example, factorial of 4 is
		 * 4*3*2*1.
		 */

		int factorial = number;

		for (int i = (number - 1); i > 1; i--) {
			factorial = factorial * i;
		}

		return factorial;
	}
}