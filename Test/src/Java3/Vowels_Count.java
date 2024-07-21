package Java3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Java.AddSubMul;



public class Vowels_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddSubMul add = new AddSubMul();
		
		add.addnumbers();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.nextLine();
		int count = 0;
		
		//List<Character> vowelsList = new ArrayList<>(); // if you use list then we have use addmethod
		
		StringBuilder vowelsList = new StringBuilder();

		
		for(int i=0;i<name.length();i++) {
			
			char EachLetter = name.charAt(i);
			
			/*
			 * no need use AEIOU insted we can conerver all the letters in name into LowerCases by using name.toLowerCase()
			 */
			
			if(EachLetter == 'a' || EachLetter == 'e'|| EachLetter == 'i'|| EachLetter == 'o'|| EachLetter == 'u'|| 
					EachLetter == 'A' || EachLetter == 'E'|| EachLetter == 'I'|| EachLetter == 'O'|| EachLetter == 'U') {
				

				
				//Char[] c = EachLetter(i);
				//System.out.println("");
				count ++;
				//vowelsList.add(EachLetter); // for list
				vowelsList.append(EachLetter); // for String Builder
			}
			
		}
		System.out.println("The Vowels are : "+vowelsList);
		System.out.println("number of Vowels in the give name is : "+count);

	}
	/*
	 * enhanced for loop or for each loop
	 */
	//  char[] nameChars = name.toCharArray();

  
    // for (char eachLetter : nameChars) { */

}
