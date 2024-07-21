package Java;

import java.util.Scanner;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
			
				int n = scan.nextInt();
				int[] s = new int[n];
				
				for(int i=0;i<=n;i++) {
					if(n == 5 || n == 10) {
						n = n * 10;
					}
					System.out.println(s);
				}

	}

}
