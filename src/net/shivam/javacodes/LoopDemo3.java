package net.shivam.javacodes;

public class LoopDemo3 {
	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--)
	    {
	        for (int j = 1; j <= i*2; j++)
	        {
	            System.out.print(" ");
	        }
	        for (int j = i; j <= 5; j++)             
	        {
	            System.out.print(j+" ");
	        }
	        for (int j = 5-1; j >= i; j--)
	        {
	            System.out.print(j+" ");             
	        }
	        System.out.println();
	    }
	}
}
