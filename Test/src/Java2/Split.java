package Java2;

import java.util.Arrays;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 String name3 = "rayudu,gmail.com";
		
		String[] split4 = name3.split("\\,");
		
		
		String name1 = "rayudu1018 gmail.com";
		
		String[] split3 = name1.split("\\s");
		
		System.out.println(Arrays.toString(split3));
		String name = "rayudu1018@gmail.com";
		
		String[] split = name.split("\\@");
		
		System.out.println(Arrays.toString(split));
		
		String[] split2 = split[1].split("\\.");
		
		System.out.println(Arrays.toString(split2));
		System.out.println("final"+Arrays.toString(split4));
		
		

	}

}
