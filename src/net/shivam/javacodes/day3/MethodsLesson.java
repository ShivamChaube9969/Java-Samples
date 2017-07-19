package net.shivam.javacodes.day3;

import java.util.Scanner;

public class MethodsLesson {
	static int RandomNo = Number();

	public static void main(String[] args) {
		Scanner userIn = new Scanner(System.in);
		int guess;
		while (true) {
			System.out.print("Guess the number : ");
			guess = userIn.nextInt();
			if (GuessNo(guess) == 1) {
				System.out.print("You are right ");
				break;
			} else {
				System.out.print("Retry\n");
			}
		}
		userIn.close();
	}

	public static int GuessNo(int guess) {
		if (RandomNo == guess) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int Number() {
		RandomNo = (int) (Math.random() * 50);
		System.out.println(RandomNo);
		return RandomNo;
	}

}
