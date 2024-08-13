package tomorrowJava;

import java.util.Scanner;

public class Casting {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type a decimal number");
		double num1 = (double) input.nextDouble();
		System.out.println(num1);
		// double become int
		int num2 = (int) num1;
		
		// show for user
		System.out.println(num2);
		
	}
}
