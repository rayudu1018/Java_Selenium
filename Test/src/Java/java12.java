package Java;

public class java12 {


	    // Method for addition
	    public static int add(int a, int b) {
	    	
	    	AddSubMul aaa = new AddSubMul();
	    	aaa.greatSt();
	        return a + b;
	        
	    }

	    // Method for subtraction
	    public static int subtract(int a, int b) {
	        return a - b;
	    }

	    // Method for multiplication
	    public static int multiply(int a, int b) {
	        return a * b;
	    }

	    public static void main(String[] args) {
	        int num1 = 10;
	        int num2 = 5;

	        int sum = add(num1, num2);
	        int difference = subtract(num1, num2);
	        int product = multiply(num1, num2);

	        System.out.println("Addition: " + sum);
	        System.out.println("Subtraction: " + difference);
	        System.out.println("Multiplication: " + product);
	    }
	}



