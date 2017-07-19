package net.shivam.javacodes.day2;

import java.util.Scanner;

public class DynamicDaimond {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
			System.out.println("Enter the number of rows you want in the pyramid : ");
			int rows = input.nextInt();
			input.close();
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= 1; j--) {
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
		for (int l = rows-1; l >= 1; l--) {
			for (int j = rows; j >= 1; j--) {
				if (j > l) {
					System.out.print("  ");
				} else {
					System.out.print(j + " ");
				}
			}
			for (int j = 2; j <= l; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
}