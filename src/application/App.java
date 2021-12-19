package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		System.out.println("Menu");
		System.out.println("====");

		System.out.println("1. Print 'hello'");
		System.out.println("2. Print 'How are you?");
		System.out.println("3. Exit program");

		System.out.println();
		System.out.print("Enter an option > ");
		Scanner scanner = new Scanner(System.in);

		int input = scanner.nextInt();
		scanner.close();

		if (input == 1) {
			System.out.println("Hello");
		} else if (input == 2) {
			System.out.println("How are you?");
		} else if (input > 100) {
			System.out.println("You've found the hidden Easter Egg");
		}
		/*
		 * else if (input == 3) { System.out.println("Exiting..."); System.exit(0); //
		 * This line should never run System.out.println("Hellooooo!"); } commented out
		 * so that I can see the second coding challenge run
		 */
		else {
			System.out.println("Invalid option");
		}
		/*
		 * Coding challenge Convert the above into a switch statement Note that you
		 * can't convert the Easter egg portion to a switch statement since switch only
		 * deals with ==
		 */

		switch (input) {
		case 1:
			System.out.println("Option 1 selected.");
			break;
		case 2:
			System.out.println("Option 2 selected.");
			break;
		/*
		 * case 3: System.out.println("Option 3 selected.");
		 * System.out.println("Exiting"); System.exit(0); break; commented out so that I
		 * can see the second coding challenge run
		 */
		default:
			System.out.println("Invalid option.");
			break;
		}

		/*
		 * Coding challenge imbed the switch statement in an if else statement such that
		 * the Easter Egg line is used.
		 */

		if (input > 100) {
			System.out.println("You've found the hidden Easter Egg");
		} else {
			switch (input) {
			case 1:
				System.out.println("Option 1 selected.");
				break;
			case 2:
				System.out.println("Option 2 selected.");
				break;
			case 3:
				System.out.println("Option 3 selected.");
				System.out.println("Exiting");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option.");
				break;
			}
		}
	}
}
