package preWorkMathChallenge;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for Math Challenge program.
 * 
 * @author Yasmin
 *
 */
public class MathChallengeTest {

	@Test
	public void validateLength_numbersWithSameLength_returnsTrue() {
		MathChallenge m = new MathChallenge();
		boolean result = m.validateLength(123, 345);
		assertTrue(result);
	}

	@Test
	public void validateLength_numbersWithDifferentLength_returnsFalse() {
		MathChallenge m = new MathChallenge();
		boolean result = m.validateLength(1234, 345);
		assertFalse(result);
	}

	@Test
	public void validateLength_numberWithOneDigit_returnsFalse() {
		MathChallenge m = new MathChallenge();
		boolean result = m.validateLength(5, 50);
		assertFalse(result);
	}

	@Test
	public void validateLength_bothnumbersWithOneDigit_returnsFalse() {
		MathChallenge m = new MathChallenge();
		boolean result = m.validateLength(5, 4);
		assertFalse(result);
	}

	@Test
	public void checkSumOfDigits_numberswithEqualSum_returnsTrue() {
		MathChallenge m = new MathChallenge();
		boolean result = m.sumOfDigitsIsEqual(543, 456);
		assertTrue(result);
	}

	@Test
	public void checkSumOfDigits_numberswithDifferentSum_returnsFalse() {
		MathChallenge m = new MathChallenge();
		boolean result = m.sumOfDigitsIsEqual(153, 345);
		assertFalse(result);
	}

	@Test
	public void checkSumOfDigits_samenumberwithDifferentSum_returnsFalse() {
		MathChallenge m = new MathChallenge();
		boolean result = m.sumOfDigitsIsEqual(123, 123);
		assertFalse(result);
	}
}
