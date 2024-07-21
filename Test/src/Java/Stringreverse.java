package Java;

import java.util.Scanner;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the text : ");
		
		String name = sc.nextLine();
		
		
		
		String rev = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			
			rev += name.charAt(i);
			
			System.out.println(name.charAt(i));
		}
		
		System.out.println("The reverse of the String is : "+rev);
	}

}
