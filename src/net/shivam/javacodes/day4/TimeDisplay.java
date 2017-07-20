package net.shivam.javacodes.day4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TimeDisplay {
	
	
public static void main(String[] args) throws InterruptedException {
		int[] Time = TimeInput.Time();
		ArrayList<Integer> Reset = new ArrayList();
		Reset.add(0, 24);
		Reset.add(1, 59);
		Reset.add(2, 59);
		System.out.print(", So the time is :\n");
		for(;;){
		Thread.sleep(1000);
		Time[2]++;
		System.out.println(Time[0]+":"+Time[1]+":"+Time[2]);
		if(Time[2] == Reset.indexOf(2)){
			Time[2] = 0;
			Time[1]++;
			System.out.println(Time[0]+":"+Time[1]+":"+Time[2]);
		}
		if(Time[1] == Reset.indexOf(1) && Time[2] == Reset.indexOf(2)){
			Time[0]++;
			Time[1] = 0;
			Time[2] = 0;
			System.out.flush();
			System.out.println(Time[0]+":"+Time[1]+":"+Time[2]);
		}
		if(Time[0] == Reset.indexOf(0)) {
			Time[0] = 0;
			Time[1] = 0;
			Time[2] = 0;
			System.out.flush();
			System.out.println(Time[0]+":"+Time[1]+":"+Time[2]);
		}
		
		
		}
//		Arrays.toString(TimeInput.Time()[0]);
	}

}
