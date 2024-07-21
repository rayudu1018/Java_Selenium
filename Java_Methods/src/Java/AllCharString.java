package Java;

import java.util.Scanner;

public class AllCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the value : ");
		
		String name = scan.nextLine();
		
		String[] ss = name.split(" ");
		for (int i=0; i < ss.length ;i++) {
			
			System.out.println(ss[i]);
			if(ss[i].contains("aeiou")) {
				
				System.out.println("aeiou");
				
			}
			
		}

	}

}
