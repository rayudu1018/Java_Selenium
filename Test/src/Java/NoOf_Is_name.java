package Java;

public class NoOf_Is_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My is name is";
		int count = 0;
		//System.out.println(name.length());
		char letter = 'i';
		
		
		
		for(int j=0;j<name.length();j++) {
			
		char c = name.charAt(j);
		
		 if(c == 'i') {
			 
			count++; 
			
			int iletter = name.indexOf(letter);
			
			 System.out.println("Location of 'i' is :"+iletter);
		 }
		
		}
		System.out.println(count);

	}

}