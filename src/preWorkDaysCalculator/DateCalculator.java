package preWorkDaysCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * This program prompts the user for two dates and calculates the time elapsed
 * between the two dates in Years, Months and Days.
 * 
 * @author Yasmin
 *
 */
public class DateCalculator {

	private int diffYears = 0;
	private int diffMonths = 0;
	private int diffDays = 0;

	/**
	 * Calls methods to prompt for the dates and calculate the difference between
	 * the dates.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		DateCalculator calc = new DateCalculator();
		String result = "";
		LocalDate date1 = null;
		LocalDate date2 = null;

		date1 = getDate();
		date2 = getDate();

		result = calc.calculateDifference(date1, date2);
		System.out.println(result);
	}

	/**
	 * Prompt the user for a date. Keep prompting until they enter a valid date.
	 * 
	 * @return the date input by the user
	 */
	public static LocalDate getDate() {
		Scanner input = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		LocalDate date = null;

		do {
			System.out.println("Enter a date. Use the format MM/DD/YYYY: ");
			try {
				date = LocalDate.parse(input.next(), formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Invalid date. Please try again.");
			}
		} while (date == null);

		return date;
	}

	/**
	 * Calculates the absolute difference between two dates in Years, Months, and
	 * Days.
	 * 
	 * @param date1
	 *            the first date
	 * @param date2
	 *            the second date
	 * @return a String containing the difference between the two dates in Years,
	 *         Months, and Days
	 */
	public String calculateDifference(LocalDate date1, LocalDate date2) {
		Period timeElapsed = Period.between(date1, date2);

		diffYears = Math.abs(timeElapsed.getYears());
		diffMonths = Math.abs(timeElapsed.getMonths());
		diffDays = Math.abs(timeElapsed.getDays());

		return String.format("Difference between the two dates:\nYears: %d\nMonths: %d\nDays: %d\n", diffYears,
				diffMonths, diffDays);
	}
}
