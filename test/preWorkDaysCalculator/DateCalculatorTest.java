package preWorkDaysCalculator;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

/**
 * Unit tests for Date Calculator program.
 * 
 * @author Yasmin
 *
 */
public class DateCalculatorTest {

	@Test
	public void calculateDifference_twoDatesSameMonth_ReturnsDaysElapsed() {
		DateCalculator c = new DateCalculator();
		LocalDate date1 = LocalDate.of(2017, 10,  03);
		LocalDate date2 = LocalDate.of(2017, 10,  23);
		String expectedResult = "Difference between the two dates:\n" + "Years: 0\n" + "Months: 0\n" + "Days: 20\n";

		String actualResult = c.calculateDifference(date1, date2);

		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void calculateDifference_twoDatesDifferentYears_ReturnsYearsMonthsAndDaysElapsed() {
		DateCalculator c = new DateCalculator();
		LocalDate date1 = LocalDate.of(1492, 10, 12);
		LocalDate date2 = LocalDate.of(2017, 10, 04);
		String expectedResult = "Difference between the two dates:\n" + "Years: 524\n" + "Months: 11\n" + "Days: 22\n";
		
		String actualResult = c.calculateDifference(date1, date2);

		assertEquals(expectedResult, actualResult);
	}
}
