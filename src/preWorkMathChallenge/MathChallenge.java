package preWorkMathChallenge;

import java.util.Scanner;

/**
 * This program reads two integers from the user and returns whether the sum of
 * the digits on each position on both integers adds up to the same total.
 * 
 * @author Yasmin
 *
 */
public class MathChallenge {

	/**
	 * Calls methods to collect input, validate it, and compute the sum of the
	 * digits.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		MathChallenge m = new MathChallenge();
		boolean validIntegers = false;
		boolean sumOfDigitsIsEqual = false;

		number1 = getNumber();
		number2 = getNumber();

		validIntegers = m.validateLength(number1, number2);

		if (validIntegers) {
			sumOfDigitsIsEqual = m.sumOfDigitsIsEqual(number1, number2);
			System.out.println("Sum of digits in each position is equal: " + sumOfDigitsIsEqual);
		} else {
			System.out.println(
					"Both numbers must have at least two digits and be the same length. Please try again.");
		}
	}

	/**
	 * Get a number from the user. If input is not numeric, it keeps prompting until
	 * they enter a valid number.
	 * 
	 * @return the number input by the user
	 */
	private static int getNumber() {
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean numericInput = false;

		do {
			System.out.println("Please enter a number: ");

			if (numericInput = input.hasNextInt()) {
				number = input.nextInt();
			}
			else {
				input.next();
			}
		} while (!numericInput);

		return number;
	}

	/**
	 * Validates that both inputs are the same length and at least two digits long.
	 * 
	 * @param number1
	 *            the first number
	 * @param number2
	 *            the second number
	 * @return true if both numbers are the same length
	 */
	public boolean validateLength(int number1, int number2) {
		int lengthNumber1 = Integer.toString(number1).length();
		int lengthNumber2 = Integer.toString(number2).length();
		return (lengthNumber1 == lengthNumber2) && (lengthNumber1 > 1) && (lengthNumber2 > 1);
	}

	/**
	 * Checks whether the sum of the digits on each position on both integers is
	 * equal
	 * 
	 * @param num1
	 *            the first number
	 * @param num2
	 *            the second number
	 * @return true if the sum of the digits on each position is the same
	 */
	public boolean sumOfDigitsIsEqual(int num1, int num2) {
		String number1 = Integer.toString(num1);
		String number2 = Integer.toString(num2);
		int sum = number1.charAt(0) + number2.charAt(0);

		for (int i = 1; i < number1.length(); i++) {
			if ((number1.charAt(i) + number2.charAt(i)) != sum) {
				return false;
			}
		}
		return true;
	}
}
