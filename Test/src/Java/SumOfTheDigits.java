package Java;

import java.util.Scanner;

public class SumOfTheDigits {
	
	

	private void sumofnumbers() {
		
		Scanner sumofnumbers = new Scanner(System.in);
		
		System.out.print("Enter the value of num1:");
		int num1 = sumofnumbers.nextInt();
		
		System.out.print("Enter the value of num1:");
		int num2 = sumofnumbers.nextInt();
		
		System.out.print("Enter the value of num1:");
		int num3 = sumofnumbers.nextInt();
		
		int sum = num1+num2+num3;
		
		
		System.out.print("Sum of the all the numbers is :"+sum);
		
	}
	
	public void number() {
		
		sumofnumbers();
	}
}
