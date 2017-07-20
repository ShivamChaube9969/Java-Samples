package net.shivam.javacodes.day4;

import java.util.Arrays;
import java.util.Scanner;

public class TimeDisplay {
	
	
public static void main(String[] args) {
		int[] Time = TimeInput.Time();
		int h = Time[0];
		int m = Time[1];
		int s = Time[2];
		System.out.print(", So the time is :\n");
		System.out.println(h+":"+m+":"+s);
//		Arrays.toString(TimeInput.Time()[0]);
	}

}
