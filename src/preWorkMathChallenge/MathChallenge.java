package preWorkMathChallenge;

import java.util.Scanner;

/**
 * The program reads two integers from the user. It then validates that both
 * integers have the same number of digits and if so, it checks if the sum of
 * the digits in the same position on each integer add up to the same total.
 * 
 * @author Yasmin
 *
 */
public class MathChallenge {

	/**
	 * Prompts the user for two numbers. Validates that input is numeric, then calls
	 * methods to validate that length of both numbers is equal and to check if the
	 * sum of the digits is equal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1 = 0;
		int number2 = 0;
		final String errorNotANumber = "You must enter a number. Please try again.";
		MathChallenge m = new MathChallenge();
		boolean valid = false;
		boolean sumOfDigitsIsEqual = false;

		System.out.println("Please enter the first number: ");
		if (input.hasNextInt()) {
			number1 = input.nextInt();
		} else {
			System.out.println(errorNotANumber);
			return;
		}

		System.out.println("Please enter the second number\n(must be the same length as the first): ");
		if (input.hasNextInt()) {
			number2 = input.nextInt();
		} else {
			System.out.println(errorNotANumber);
			return;
		}

		valid = m.validateLength(number1, number2);

		if (valid) {
			sumOfDigitsIsEqual = m.sumOfDigitsIsEqual(number1, number2);
			System.out.println("Sum of Digits is Equal: " + sumOfDigitsIsEqual);
		} else {
			System.out.println("Both numbers must be the same length. Please try again.");
		}
	}

	/**
	 * Validates that both inputs are the same length.
	 * 
	 * @param input1
	 *            the first number
	 * @param input2
	 *            the second number
	 * @return true if both numbers are the same length
	 */
	public boolean validateLength(int number1, int number2) {
		int lengthNumber1 = Integer.toString(number1).length();
		int lengthNumber2 = Integer.toString(number2).length();
		return lengthNumber1 == lengthNumber2;
	}

	/**
	 * Validates that the sum of the digits in each position in both numbers is
	 * equal
	 * 
	 * @param number1
	 *            the first number
	 * @param number2
	 *            the second number
	 * @return true if the sum of the digits in each place is the same
	 */
	public boolean sumOfDigitsIsEqual(int number1, int number2) {
		int numDigits = 0;
		int previousSum = 0;

		while (number1 > 0 && number2 > 0) {
			int sum = (number1 % 10) + (number2 % 10);
			if (numDigits > 0 && sum != previousSum) {
				return false;
			}

			previousSum = sum;
			++numDigits;

			number1 /= 10;
			number2 /= 10;
		}
		return true;
	}
}
