public class FizzBuzz {

	public String playGame(int yourNumber) {

		if (yourNumber < 1) {
			return "Invalid";
		} else if(yourNumber % 15 == 0) {
			return "FizzBuzz";
		} else if (yourNumber % 3 == 0) {
			return "Fizz";
		} else if (yourNumber % 5 == 0) {
			return "Buzz";
		} else if (yourNumber >= 1) {
			return "" + yourNumber; // cast this int to be a string
		}

	}

}
