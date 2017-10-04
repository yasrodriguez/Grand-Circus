package preWorkDaysCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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
	 * Prompts the user for two dates, converts them to a proper date and calls the
	 * calculate difference method. An invalid date format will result in a
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LocalDate date1 = null;
		LocalDate date2 = null;
		final String prompt = "Enter a date. Use the format MM/DD/YYYY: ";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/uuuu");
		DateCalculator calc = new DateCalculator();
		String result = "";

		System.out.println(prompt);
		date1 = LocalDate.parse(input.next(), formatter);

		System.out.println(prompt);
		date2 = LocalDate.parse(input.next(), formatter);

		result = calc.calculateDifference(date1, date2);
		System.out.println(result);
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
