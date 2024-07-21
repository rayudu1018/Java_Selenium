package Java;

import java.util.Scanner;

public class Main_Method {

	public static void main(Stringname[] args) {
		// TODO Auto-generated method stub
		Main_Method mm = new Main_Method();
		
		mm.smallestNumber();
		mm.averageNumbers();
		
	}
	
	public int smallestNumber() {
         Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value of 1st number : ");
		
		int num1 = scan.nextInt();
		
        System.out.print("Enter the value of 2nd number : ");
		
		int num2 = scan.nextInt();
		
		
		 System.out.print("Enter the value of 3rd number : ");
			
			int num3 = scan.nextInt();
			
		if (num1< num2 && num1< num3) {
			
			System.out.print("The lowest value amoung the 3 numbers are 1st number value is : "+num1);
		}else if (num2< num1 && num2< num3) {
			
			System.out.print("The lowest value amoung the 3 numbers are 2nd number value is : "+num2);
		}if (num3< num2 && num3< num1) {
			
			System.out.print("The lowest value amoung the 3 numbers are 3rd number value is : "+num3);
		}if (num1==num2 && num1==num3) {
			
			System.out.print("All 3 numbers are equal ");
		}
       return 0;
	}
	
	public double averageNumbers() {
		
          Scanner scan = new Scanner(System.in);
		
		 System.out.print("Enter the value of 1st number : ");
		
		  int num1 = scan.nextInt();
		
         System.out.print("Enter the value of 2nd number : ");
		
		   int num2 = scan.nextInt();
		
		
		 System.out.print("Enter the value of 3rd number : ");
			
			int num3 = scan.nextInt();
			

				double sum = num1+num2+num3;
				
				double average = sum/3;
				
				
				 System.out.print("Average of 3 numbers is : "+average);	
			
		
		return 0.0;
	}

}
