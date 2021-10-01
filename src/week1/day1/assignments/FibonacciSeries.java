package week1.day1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int input = 20;
		int first =0;
		
		int second = 1;
		
		//System.out.println(first);
		//System.out.println(second);
		
		int third = 0;
		
	
	for (int i = 1; i <= input	; i++) {
		
			
	third = first + second;
	   // System.out.println(third);
	
	    first = second;
	    second = third;
	    System.out.println(third);
	    
	}
	
		/*
		 * int range =8, firstNumber = 0, secondNumber =1, sum=0;
		 * 
		 * System.out.println(firstNumber+" "+secondNumber);
		 * 
		 * for (int i=2; i <range; i++) {
		 * 
		 * sum = firstNumber + secondNumber;
		 * 
		 * firstNumber = secondNumber;
		 * 
		 * secondNumber = sum;
		 * 
		 * System.out.println(" "+sum); }
		 */
		
	}

}
