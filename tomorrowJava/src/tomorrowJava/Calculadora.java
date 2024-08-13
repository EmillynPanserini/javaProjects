package tomorrowJava;

import java.util.Scanner;

public class Calculadora {
	public static void main (String [] args) {
		
		Scanner input = new Scanner(System.in);
	
		// user input
		System.out.println("Type a number");
		double  num1 = input.nextDouble();
		
		System.out.println("Other one");
		double num2 = input.nextDouble();
		
        int option;

		do {
			System.out.println("Which operation do you want?:");
			
			System.out.println("1. Sum  2. Subtraction 3. Division 4. Multiplication 5. Sair ");
			option = input.nextInt();
			
			switch(option) {
			
				case 1:{
					double result = num1 + num2;	
					System.out.println(result);
					break;
				}	
				case 2:{
					double result = num1 - num2; 
					System.out.println(result);
					break;
				}
				case 3:{
					double result = num1/num2;
					System.out.println(result);
					break;
				}
				case 4:{
					double result = num1 * num2;
					System.out.println(result);
					break;
				}
				case 5:{
                    break;
                }
				default:
					System.out.println("Enter a valid option");
												
	        }
			
        }while(option != 5);
    }
}