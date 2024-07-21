package Java2;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Venkata";
		
		String rev = "" ;
		
		for(int i=s.length()-1;i>=0;i--) {
			
			char c = s.charAt(i);
			
		     rev = rev+c;
		     
		   
			
			//System.out.print(c);
			
		}
		  System.out.println(rev);
		
		/*String s = "AkashReddy";
		String rev = ""; 
		
		for (int i = s.length()-1; i>=0; i--)
		{
		rev = rev + s.charAt(i);
							
		}
		
		System.out.println("reverse of character :" +rev );*/
	}

}
