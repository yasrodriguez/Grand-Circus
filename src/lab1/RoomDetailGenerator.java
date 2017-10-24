package lab1;

import java.util.Scanner;

public class RoomDetailGenerator {

	public static void main(String[] args) {
		double length = 0;
		double width = 0;
		double height = 0;
		double area = 0;
		double perimeter = 0;
		double volume = 0;
		Scanner scnr = new Scanner(System.in);
		String response = "";
		boolean keepGoing = false;

		System.out.println("Welcome to the Grand Circus' Room Detail Generator");

		do {
			System.out.print("Enter Length: ");
			if (scnr.hasNextDouble()) {
				length = scnr.nextDouble();
			}

			System.out.print("Enter Width: ");
			if (scnr.hasNextDouble()) {
				width = scnr.nextDouble();
			}

			System.out.print("Enter Height: ");
			if (scnr.hasNextDouble()) {
				height = scnr.nextDouble();
			}

			if (width > 0 && length > 0 && height > 0) {
				area = calculateArea(length, width);
				System.out.println("Area: " + area);

				perimeter = calculatePerimeter(length, width);
				System.out.println("Perimeter: " + perimeter);

				volume = calculateVolume(length, width, height);
				System.out.println("Volume: " + volume);
			} else {
				System.out.println("You must enter a number greater than 0. Please try again.");
				scnr.next();
			}

			System.out.println("Continue? (y/n): ");
			response = scnr.next().toLowerCase();

			if (response.equals("y")) {
				keepGoing = true;
			} else {
				keepGoing = false;
			}

		} while (keepGoing);
	}

	public static double calculateArea(double length, double width) {
		return length * width;
	}

	public static double calculatePerimeter(double length, double width) {
		return (2 * length) + (2 * width);
	}

	public static double calculateVolume(double length, double width, double height) {
		return length * width * height;
	}
}
