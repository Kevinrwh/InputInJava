/*
 Kevin Ramos
 COP3330 
 HW1: Basic IO Program
 05/29/2020
 */

package iopackage;
import java.util.Scanner;

public class IOclass {

	public static void main(String[] args) {

		// Use the scanner to read in user input
		Scanner inputStuff = new Scanner(System.in);
		
		// Store input into corresponding variables
		int a = inputStuff.nextInt();
		int b = inputStuff.nextInt();
		int c = inputStuff.nextInt();
		
		System.out.print("The three numbers are: ");
		System.out.print(a + ", " + b + ", and " + c + ".\n");
		
		// Calculate the sum of the three integers and print it to the user
		int sum = a + b + c;
		System.out.println("The sum of the numbers is: "+sum);
		
		// Calculate the average and print to the user
		float avg = sum/3;
		System.out.print("The average of the numbers is:");
		System.out.printf(" %.2f", avg); // using %.2f allows us to print with two decimal places
	}

}
