package Java;

import java.util.Scanner;

public class AddSubMul {
	
	int xyz;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddSubMul n = new AddSubMul();
		
		
		
		Averageofnumbers av = new Averageofnumbers();
		//n.add();
		n.addnumbers();
		n.subnumbers();
		n.Mulnumbers();
		n.greatSt();

	}
	

	public int addnumbers() {
		
		System.out.println(xyz);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println(c);
		
		return c;
	}
	
	public int sub() {
		AddSubMul n = new AddSubMul();
		n.subnumbers();
		return 0;
		
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
	
	   int Mulnumbers() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter the value of a:");
		
		int a = sc.nextInt();
		
		System.out.print("enter the value of b:");
		int b = sc.nextInt();
		
		int c = a * b;
		
		System.out.print(c);
		
		return c;
	}
	
	   protected int greatSt() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("enter the value of a:");
	        int a = sc.nextInt();

	        System.out.print("enter the value of b:");
	        int b = sc.nextInt();

	        System.out.print("enter the value of c:");
	        int c = sc.nextInt();

	        if (a > b && a > c) {
	            System.out.println("Greatest a:" + a);
	            return a;
	        } else if (b > a && b > c) {
	            System.out.println("Greatest b:" + b);
	            return b;
	        } else if (a==b && a==c){
	            System.out.println("all are equal");
	            return c;
	        } else {
	        	System.out.println("Greatest c:" + c);
	        }
	   return 0;

}
}
