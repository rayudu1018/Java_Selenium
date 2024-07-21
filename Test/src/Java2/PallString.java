package Java2;

public class PallString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MadaM";
		String rev = "";
		
		
	for(int i = str.length()-1;i>=0;i--) {
		
		rev = rev+str.charAt(i);
	}System.out.println(rev);
	
	if(str.equals(rev)) {
		System.out.println("ppppp");
	}
	
	if(rev.contains("Rayudu")) {
		System.out.println("ppppp");
		
	}else {
		System.out.println("not ppp");
	}

	}	

}
