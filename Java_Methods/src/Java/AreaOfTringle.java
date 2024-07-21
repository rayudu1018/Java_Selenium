package Java;

import java.util.Scanner;

public class AreaOfTringle {

		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);

		        System.out.print("Enter the value of 1st side: ");
		        int a = scan.nextInt();

		        System.out.print("Enter the value of 2nd side: ");
		        int b = scan.nextInt();

		        System.out.print("Enter the value of 3rd side: ");
		        int c = scan.nextInt();

		        double area = calculateArea(a, b, c);
		        System.out.println("The area of the triangle is: " + area);
		    }

		    private static double calculateArea(int a, int b, int c) {
		        double s = (double) (a + b + c) / 2; 
		        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c)); 
		        return area;
		    }

	}


