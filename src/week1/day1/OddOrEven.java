package week1.day1;

public class OddOrEven {

	public static void main(String[] args) {
	
		
		int input = 26;
		
		if (input % 2 ==0){
		
		System.out.println("is an even number");}
		
		else {
			System.out.println("is an odd number");}
		
		//want to verify all odd numbers in a series from 1 to 10
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 1) {
				
				System.out.println("Odd number "+i);
				
			}
			else {
				System.out.println("Even number "+i);
			}
			
		}
		
		
		

	}

}
