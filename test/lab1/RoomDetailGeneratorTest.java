package lab1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for Lab 1 - Room Detail Generator
 * 
 * @author Yasmin
 *
 */
public class RoomDetailGeneratorTest {


	@Test
	public void calculateArea_validInput_returnsRoomArea() {
		// arrange
		double length = 24.5;
		double width = 20;
		double expectedArea = 490;

		// act
		double actualArea = RoomDetailGenerator.calculateArea(length, width);

		// assert
		assertEquals(expectedArea, actualArea, 0);
	}

	@Test
	public void calculatePerimeter_validInput_returnsRoomPerimeter() {
		// arrange
		double length = 24.5;
		double width = 20;
		double expectedPerimeter = 89;

		// act
		double actualPerimeter = RoomDetailGenerator.calculatePerimeter(length, width);

		// assert
		assertEquals(expectedPerimeter, actualPerimeter, 0);
	}

	@Test
	public void calculateVolume_validInput_returnsRoomVolume() {
		// arrange
		double length = 24.5;
		double width = 20;
		double height = 8;
		double expectedVolume = 3920;

		// act
		double actualVolume = RoomDetailGenerator.calculateVolume(length, width, height);

		// assert
		assertEquals(expectedVolume, actualVolume, 0);
	}

	@Test
	public void calculateArea_thePenthouseMeasurements_returnsPenthouseAreaWithCorrectDecimals() {
		// arrange
		double length = 42.5;
		double width = 16.5;
		double expectedArea = 701.25;

		// act
		double actualArea = RoomDetailGenerator.calculateArea(length, width);

		// assert
		assertEquals(expectedArea, actualArea, 0);
	}

	@Test
	public void calculatePerimeter_validInputWithDecimals_returnsRoomPerimeterWithCorrectDecimals() {
		// arrange
		double length = 42.3;
		double width = 16.5;
		double expectedPerimeter = 117.6;

		// act
		double actualPerimeter = RoomDetailGenerator.calculatePerimeter(length, width);

		// assert
		assertEquals(expectedPerimeter, actualPerimeter, 0);
	}

}
