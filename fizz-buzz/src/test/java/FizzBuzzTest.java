import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	FizzBuzz underTest = new FizzBuzz();

	@Test
	public void shouldSayInvalidForValueUnderOne() {
				String response = underTest.playGame(-2);
		assertEquals("Invalid", response);
	}

	@Test
	public void shouldSayOneForValueOne() {
		String response = underTest.playGame(1);
		assertEquals("1", response);
	}

	@Test
	public void shouldSayTwoForValueTwo() {
		String response = underTest.playGame(2);
		assertEquals("2", response);
	}

	@Test
	public void shouldSayFizzForValueThree() {
		String response = underTest.playGame(3);
		assertEquals("Fizz", response);
	}

	@Test
	public void shouldSayBuzzForValueFive() {
		String response = underTest.playGame(5);
		assertEquals("Buzz", response);
	
	}
	
	@Test
	public void shouldSayFizzBuzzForValueFifteen() {
		String response = underTest.playGame(15);
		assertEquals("FizzBuzz", response);
		
	}

}