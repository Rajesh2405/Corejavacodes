package week1.day1.assignments;

import java.util.regex.Pattern;

public class Armstrongnumber {
	
	
	public static void main(String[] args) {
		
		
		  int i = 153;
		  
		  int sum = 0;
		  
		  int temp = i;
		  
		  while (i>0) {
		  
		  int rem = i % 10;
		  sum = sum +(rem*rem*rem);
		  i = i/10; 
		  } 
		  if (temp == sum) {
		  System.out.println("Given number is Armstrong number "+temp); } else {
		  System.out.println("Given number is not an Armstrong number "+temp); }
		 
		//Regular expression practice with sample words  
		  
		 Pattern p = Pattern.compile("wowo");
		
		boolean test1 = p.matcher("sowo").matches();
			
		System.out.println(test1);
		
		boolean test2 = Pattern.matches("ra.esh", "rajesh");
		
		System.out.println(test2);
			
		}
		

	}


