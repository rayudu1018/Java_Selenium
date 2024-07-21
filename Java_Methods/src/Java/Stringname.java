package Java;

import java.util.Scanner;

public class Stringname {

    public static void main(java.lang.String[] args) {
    	

    	Stringname Sn = new Stringname();
    	Sn.middelChar();
    	Sn.countVowels();
    	Sn.arrayCount();
    	Sn.sumDigits();
    	//Sn.areaOfTringle();
        
    }
    
    public String middelChar() {
    	
    	        Scanner scan = new Scanner(System.in);

    	        System.out.print("Value of the String is: ");
    	        String name = scan.nextLine();

    	        System.out.println("Length of the string: " + name.length());

    	        if (name.length() % 2 == 0) { 
    	            int middleIndex = name.length() / 2;
    	            System.out.println("Middle elements: " + name.charAt(middleIndex - 1) + ", " + name.charAt(middleIndex));
    	        } else { 
    	            int middleIndex = name.length() / 2;
    	            System.out.println("Middle element: " + name.charAt(middleIndex));
    	        }
    	        
    	        return "";
    }
    
         public String countVowels() {
      	
          	Scanner scan = new Scanner(System.in);
    	
    	     System.out.print("Value of the String is: ");
    	  
    	       String name = scan.nextLine();
    	       
    	       String[] word = name.split(" ");
    	       
    	       System.out.println("number words in given name : "+word.length);
    	       System.out.println("vowels in the give name are :");
    	  
    	  for(int i = 0;i<name.length();i++) {
    		  
    		  if (name.toLowerCase().charAt(i) == 'a'|| name.toLowerCase().charAt(i) == 'e'||name.toLowerCase().charAt(i) == 'i'||name.toLowerCase().charAt(i) == 'o'||name.toLowerCase().charAt(i) == 'u') {
    			  
  	        	System.out.println(name.charAt(i));
  	        }  
    	  }
	       
	       
    	return "";
    }
    
    // char[] vowels = {'a','e','i','o','u'};
    
    public void arrayCount() {
    	Scanner scan = new Scanner(System.in);
    	
  	      System.out.print("Value of the String is: ");
  	  
  	        String name = scan.nextLine();
  	        
  	          String[] vowels = {"a","e","i","o","u"};
  	        
  	     for (String vowel : vowels){
  	    	  
  	    	  if (name.toLowerCase().contains(vowel)) {
  	    		  
  	    		  System.out.println(vowel);
  	    		  
  	    	  }
  	    	  
  	      }
    	
    }
    
    public int sumDigits() {
    	Scanner scan = new Scanner(System.in);
    	
	      System.out.print("The value of the number is : ");
	  
	        int number = scan.nextInt();
	        int sum =0;
	        
	        String name = Integer.toString(number);
	        
	        while(number != 0) {  // we can find by coverting int into String
	        	
	        	sum = sum+number%10;
	        	
	        	number = number/10;
	        }
    	System.out.println(sum);
    	return 0;
    	
    }
    
    public double areaOfTringle() {
    	
       Scanner scan = new Scanner(System.in);
		
		   System.out.print("Enter the value of 1st number : ");
		
		    int a = scan.nextInt();
		
          System.out.print("Enter the value of 2nd number : ");
		
		    int b = scan.nextInt();
		
		
		 System.out.print("Enter the value of 3rd number : ");
			
			int c = scan.nextInt();
			
			double result = 0.5*a*b*c;
			
			System.out.print("The value is : "+ result);
    	
    	return 0.0;
    }
    
    public String name() {
    	
    	
    	return "";
    }
    
    
    
}
