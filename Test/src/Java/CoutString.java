package Java;

import java.util.Scanner;

public class CoutString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the name : ");
		
		String name = scn.nextLine();
		
		int length = name.length();
		
		
		System.out.println("The length of the name '"+name+"' is '"+length+"'");
		
		int count = 0;
		String cha = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if(ch == 'a' | ch == 'e' | ch == 'i' | ch == 'o' | ch == 'u' ) {
            	cha += ch;
            	
             count ++;
  	
            }
            	
        }     System.out.println("vowles count :"+count+"{"+cha+"}");
		
	}
	

}
