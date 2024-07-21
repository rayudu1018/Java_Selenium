package Java;

import java.util.Scanner;

public class NumberInt {

	public static void main(String[] args) {
		
		
		NumberInt num1 = new NumberInt();
		num1.num(); 
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the values of the number :");
		
		int number = scan.nextInt();
		
		 int count = 0;
		
		 
		while(number!=0) {
			
			int x = number % 10;
			
			System.out.println("value is "+x);
			
			 if ( x == 2 ) {
				 count ++;
				 
				 System.out.println("tyuiklmnbvcdfrtyu"); 
			 }
			 
			
			 number = number/10;
			 
			 
			 
		}System.out.println("2 is present in the given number is :"+count+"times");

	}
	
	public int num() {
		
       Scanner scan = new Scanner(System.in);
		
		System.out.print("wervxuyvxuv xhxi x  :");
		
		int number = scan.nextInt();
		
		 int count = 0;
		 
		for (int w=0; w<number; w /=10) {
			
            int x = number % 10;
			
			System.out.println("value is "+x);
			
			 if ( x == 2 ) {
				 
				 count ++;
				 
				 System.out.println("tyuiklmnbvcdfrtyu"); 
			 }
			 
			
			 w = number/10;
			
		}
		
		return 0;
	}

}
