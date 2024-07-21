package Java;

import java.util.Scanner;

import java.util.Scanner;

import java.util.Scanner;

public class NumberValidation {

    public static void main(String[] args) {
    	
    	NumberValidation n1 = new NumberValidation();
    	n1.number1();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = scan.nextInt();
        int originalNumber = number;

        System.out.println("Even digits:");
        while (number!= 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }

        System.out.println("\nOdd digits:");
        number = originalNumber;
        while (number!= 0) {
            int digit = number % 10;
            if (digit % 2 == 1) {
                System.out.print(digit + " ");
            }
            number /= 10;
        }
    }
    
    
    /********************************/
    
    
        public int number1() {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the number:");
            int number = scan.nextInt();

            int[] even = new int[10]; // assuming max 10 digits
            int[] odd = new int[10]; // assuming max 10 digits
            int evenCount = 0;
            int oddCount = 0;

            while (number != 0) {
                int digit = number % 10;

                if (digit % 2 == 0) {
                    even[evenCount++] = digit;
                } else {
                    odd[oddCount++] = digit;
                }

                number /= 10;
            }

            System.out.println("Even digits:");
            for (int i = 0; i < evenCount; i++) {
                System.out.print(even[i] + " ");
            }

            System.out.println("\nOdd digits:");
            for (int i = 0; i < oddCount; i++) {
                System.out.print(odd[i] + " ");
            }
            return 0;
        }
    }
    
    
