package Java2;

import java.util.Scanner;

public class sample {


	 public int addnumbers() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println(c);
		
		return c;
	}
	
	 private int subnumbers() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		int c = a - b;
		
		System.out.println(c);
		
		return c;
	}
	
	   int Mulnumbers_s() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		int c = a * b;
		
		System.out.print(c);
		
		return c;
	}
	   
	   protected int div() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("enter the value of a:");
			
			int a = sc.nextInt();
			
			System.out.print("enter the value of b:");
			int b = sc.nextInt();
			
			int c = a % b;
			
			System.out.print(c);
			
			return c; 
		   
		  
	   }
	   
	   public void nnn() {
		   subnumbers();
	   }
	

}
