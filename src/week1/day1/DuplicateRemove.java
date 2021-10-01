package week1.day1;

import java.util.Arrays;

public class DuplicateRemove {

	public static void main(String[] args) {

		int a[] = { 1, 2, 2, 3, 4, 5, 5, 6, 8, 9, 2, 6, 8, 9, 10 };
		
		for (int i = 0; i < a.length; i++) {
			
			int k = 0;
			
			for (int j = 1; j < a.length; j++) {
				
				if (a[i]!=(a[j])) {
					
					k++;
				}
				
			}
			
			//System.out.println(a[i]);
			
			if (k==1) {
				
		  System.out.println(a[i]);
			}
			
			}
			
			
		}

	}
