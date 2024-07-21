package Java2;

public class PNumber {

    public static void main(String[] args) {
        int number = 12321;

        int originalNumber = number;
        int reversedNumber = 0;

        for (int n = number; n > 0; n /= 10) {
        	
        	/*
        	 * int c=0;
        	 * 
        	 * c = c+i// c +=  i  n = n/10
        	 * 
        	 * 
        	 */
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}


