package week1.day1;

public class StaticExplained {

	 int a = 10;
	
	public static void staticmethod() {

		int a = 100;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		StaticExplained.staticmethod();
		
		StaticExplained obj = new StaticExplained();
		
		System.out.println(obj.a);
	}

}
