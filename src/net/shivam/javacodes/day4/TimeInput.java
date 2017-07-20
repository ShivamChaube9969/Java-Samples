package net.shivam.javacodes.day4;

import java.util.Arrays;
import java.util.Scanner;

public class TimeInput extends TimeDisplay {

	public static int[] Time() {
		Scanner TimeIn = new Scanner(System.in);
		int h, m, s;
		do {
			System.out.print("\nHours : ");
			h = TimeIn.nextInt();
			if (!(h > -1 && h < 25)) {
				System.out.print("\nHours invalid");
			}
		} while (!(h > -1 && h < 25));
		System.out.print("\n ok");
		do {
			System.out.print("\nMinutes : ");
			m = TimeIn.nextInt();
			if (!(m > -1 && m < 61)) {
				System.out.print("\nMinutes invalid");
			}
		} while (!(m > -1 && m < 60));
		System.out.print("\n ok");
		do {
			System.out.print("\nSeconds : ");
			s = TimeIn.nextInt();
			if (!(s > -1 && s < 61)) {
				System.out.print("\nSeconds invalid");
			}
		} while (!(s > -1 && s < 60));
		System.out.print(" ok");
		//TimeIn.close();
		int[] t = { h, m, s };

		return t;

	}

}
