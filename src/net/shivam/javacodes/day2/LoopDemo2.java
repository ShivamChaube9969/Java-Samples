package net.shivam.javacodes.day2;

public class LoopDemo2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= 1; j--) {
				if (j > i) {
					System.out.print("  ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();

		}
	}
}
