package weekthree.dayone;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator obj = new Calculator();
		
		int output1 = obj.addition(60,70);
		
		int output2 = obj.addition(40, 30);
		
		obj.subtraction(output1, output2);
		
		
		
	}
	
	
	public int addition(int a, int b) {
		int c=a+b;
		System.out.println(c);
		return c;
	}
	


	public double addition(double a, double b) {
		double c=a+b;
		System.out.println(c);
		return c;
	}
	
	
	public int addition(int a, int b, int d) {
		int c=a+b+d;
		System.out.println(c);
		return c;
	}
	
	
	
	public void subtraction(int a, int b) {
		int c=a-b;
		System.out.println(c);
	}

}
