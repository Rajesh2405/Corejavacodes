package week1.day1.assignments;

public class Swapnumbers {

	
	public void numswap(int a, int b) {

		int c;
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Value of a becomes "+a);
		System.out.println("Value of b becomes "+b);
		
	}
	// Number swap without 3rd variable
	public void numswapWitoutvar(int i, int j) {

		    i = i + j; //300
		    j = i - j; //100
		    i = i - j; //200
		
		System.out.println(i);
		System.out.println(j);
	}
	
	
	public static void main(String[] args) {

		Swapnumbers nSw = new Swapnumbers();
		
		nSw.numswap(100, 200);
	
		nSw.numswapWitoutvar(100, 200);
	}


}
