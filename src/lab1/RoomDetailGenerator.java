package lab1;

import java.util.Scanner;

/**
 * This program prompts the user for the length, width, and height of a
 * rectangular room and returns the area, perimeter and volume of the room.
 * 
 * @author Yasmin
 *
 */
public class RoomDetailGenerator {

	private static Scanner scnr = new Scanner(System.in);

	/**
	 * Calls functions to get user input, calculate formulas, and determine whether
	 * to keep running the program.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double length = 0;
		double width = 0;
		double height = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;

		System.out.println("Welcome to the Grand Circus' Room Detail Generator!");

		do {
			length = getInput("Length");
			width = getInput("Width");
			height = getInput("Height");

			area = calculateArea(length, width);
			perimeter = calculatePerimeter(length, width);
			volume = calculateVolume(length, width, height);

			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);

		} while (keepGoing());

		scnr.close();
	}

	/**
	 * Prompts the user for input and processes it if it's numeric. If the input is
	 * not numeric, it displays a message and continues prompting until numeric
	 * input is entered.
	 * 
	 * @param prompt
	 *            the message to display to the user
	 * @return number input by the user
	 */
	public static double getInput(String prompt) {
		boolean valid = false;
		double input = 0;

		do {
			System.out.print("Enter " + prompt + ": ");
			if (scnr.hasNextDouble()) {
				input = scnr.nextDouble();
				valid = true;
			} else {
				System.out.println("You must enter a number. Please try again.");
				scnr.next();
			}

		} while (!valid);

		return input;
	}

	/**
	 * Calculates the area of the room.
	 * 
	 * @param length
	 *            the length of the room
	 * @param width
	 *            the width of the room
	 * @return area of the room
	 */
	public static double calculateArea(double length, double width) {
		return length * width;
	}

	/**
	 * Calculates the perimeter of the room.
	 * 
	 * @param length
	 *            the length of the room
	 * @param width
	 *            the width of the room
	 * @return perimeter of the room
	 */
	public static double calculatePerimeter(double length, double width) {
		return (2 * length) + (2 * width);
	}

	/**
	 * Calculates the volume of the room.
	 * 
	 * @param length
	 *            the length of the room
	 * @param width
	 *            the width of the room
	 * @param height
	 *            the height of the room
	 * @return volume of the room
	 */
	public static double calculateVolume(double length, double width, double height) {
		return length * width * height;
	}

	/**
	 * Prompts the user whether they want to continue calculating for other rooms.
	 * 
	 * @return true if the user responds Y or y
	 */
	public static boolean keepGoing() {
		System.out.println("");
		System.out.println("Continue? (y/n): ");
		String response = scnr.next().toLowerCase();

		return response.equals("y");
	}
}
