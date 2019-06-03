import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		FizzBuzz game = new FizzBuzz();

		System.out.println("Enter a non negative value");
		System.out.println("Type 0 to exit");
		int value = input.nextInt();

		while (value != 0) {
			System.out.println(game.playGame(value));
			System.out.println("Enter a non negative value");
			System.out.println("Type 0 to exit");
			value = input.nextInt();
		}
		System.out.println("Thanks for playing!");
	}

}
