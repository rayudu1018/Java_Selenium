package Java;

public class IndexOfEachLetter {

	    public static void main(String[] args) {
	        String name = "Venkata Rayudu Adapa";
	        char targetChar = 'a';
	        
	        System.out.print("The indices of 'a' in the string are: ");
	        for (int i = 0; i < name.length(); i++) {
	            if (name.charAt(i) == targetChar) {
	            	
	                System.out.print(i + " ");
	                System.out.println("The letters are :"+name.charAt(i));
	            }
	        }
	    }
	}



