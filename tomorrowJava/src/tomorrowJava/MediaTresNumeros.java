package tomorrowJava;
import java.util.Scanner;

public class MediaTresNumeros {
	public static void main (String[] args){
		Scanner input = new Scanner (System.in);
		
		System.out.println("Program for calculating the averenge");
		System.out.println("Type the first number");
		double num1 = input.nextDouble();

		System.out.println("Type the second one");
		double num2 = input.nextDouble();
		
		System.out.println("Type the third one");
		double num3 = input.nextDouble();
		
		
		double media = (num1 + num2 + num3)/3;
		System.out.println(media);
				
	}
}
