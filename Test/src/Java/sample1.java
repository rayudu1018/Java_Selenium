package Java;

import java.util.Arrays;
import java.util.Scanner;

public class sample1 {
	


   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
	/***** smallest number***************/
		
		System.out.print("enter 1st number is: ");
		int a = scanner.nextInt();
		System.out.print("enter 2nd number is: " );
        int b = scanner.nextInt();
        System.out.print("enter 3rd number is: " );
        int c = scanner.nextInt();

        int smallest = a;

        if (b < smallest) {
        	
            smallest = b;
        }

        else if (c < smallest) {
        	
            smallest = c;
        }
        
 /******************average*************/ 
        
       int  sum = a + b + c;
       double average =  (sum / 3);
       
       System.out.println("****************************");
       
        System.out.println("The smallest number is: " + smallest);
        
        System.out.println("The avg number is: " + average);
        
        System.out.println("****************************");
        
 /**********NAME is even or odd **********/
        
    	System.out.print("enter name: ");
    	
    	Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        int length = name.length();
        
       System.out.println("the length: "+length);
       
 
        if (length % 2 == 0) {
        	
            System.out.println("The length of the name '" + name+ "' is:'" +length+ "' is even.");
            int mid = length / 2;
            System.out.println("The length of the name '" + name.charAt(mid-1)+name.charAt(mid)+"'" );
      
        } 
        else {
        	
            System.out.println("The length of the name " + name + "' is odd.");
            int mid = length / 2;
            System.out.println("The length of the name " + name.charAt(mid) ); 
            
        }
        
        System.out.println("****************************");
        
   /******************** vowels Count **********************/
        

        System.out.println("Number of vowels in the name '" + name + "': " );
        
        int count = 0;
		String vowles = "";
        for (int i = 0; i <  name.length(); i++) {
        	
            char ch = name.charAt(i);
            
            if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' ) {
            	vowles += ch;
            	
             count ++;
  	
            }
            	
        }     System.out.println("vowles count :"+count+"{"+vowles+"}");
        
        System.out.println("****************************");
        
        
      String[] word = name.split(" ");
      
        
        System.out.println("wordcount is : "+word.length);	
        System.out.println("Words: " + Arrays.toString(word));
        System.out.println("****************************");
        
        
        System.out.print("Enter the digit");
        int digitssum = scanner.nextInt();
        int sumofthedigits = 0;
        while (digitssum != 0) {
        	
        	 int sod = digitssum%10;
        	 
        	 sumofthedigits += sod;
        	 
        	 
        	 digitssum/=10;
        	
        	
        }System.out.print("sum of the digits :"+sumofthedigits);
        
	}
	
	 
       
        	
        	
	}
	



