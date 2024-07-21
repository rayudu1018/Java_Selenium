package Java;

import java.util.Scanner;

public class Palandrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter  the number is :");
		
		int number = scan.nextInt();
		
		int temp = 0;
		
		for(int i = 1 ;i <=number;i++) {
			
			int s =0;
			temp = i;
			int x =0;
			s = i;
			while(s != 0) {
				//x = i; 
				x = x*10+s%10;	
				
				s = s/10;	
				
			}
			
			//System.out.println(" "+x);
			if (temp == x) {
			
				System.out.print(" "+x);
				
			}
		}

	}

}
