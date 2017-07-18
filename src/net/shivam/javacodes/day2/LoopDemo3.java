package net.shivam.javacodes.day2;

public class LoopDemo3 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(j + " ");
				}
			}

			for (int j = 2; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
}
