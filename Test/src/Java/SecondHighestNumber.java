package Java;

public class SecondHighestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7};
		int num1 = num[0];
		
		int lowest = num[0];
		
		int a = num.length;
		
		System.out.println(a);
		
		for(int i = 0;i<num.length;i++) {
			
		
		
		if (num[i] < num1) {
		
			num1 = num[i];
			
			lowest = num1;
		}
		
		}System.out.println(num1);
		System.out.println(lowest);
		
	}

}
