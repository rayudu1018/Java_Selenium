package Java;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner scan = new Scanner(System.in);
		
		System.out.println("enter  the number is :");
		
		int number = scan.nextInt();
		
		int x =1;
		
		for(int i = 1 ;i <=number;i++) {
			
		    x =  x*i;
			
		}
		System.out.println(x);
		
	}

}
