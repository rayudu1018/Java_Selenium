package Java;

public class namesinner {

	public String name() {
		
		String n = "Venkata Rayudu Adapa";
		
		int x = n.length();
		System.out.println("The length of String :"+x);
		
		String[] b = n.split(" ");
		int numberOfWords = b.length;
		System.out.println("the number of words : "+numberOfWords);
		
		String f = b[0];
		String e = b[1];
		String w = b[2].substring(0,1);
		char z = b[2].charAt(0);// we can in ways of by using substring or by using CharAT
		
		String totalname = f + " " +e+ " " +w+" //last letter by using char://"+z;
		System.out.println(totalname);
		
		
		return "";
		
	}
}
