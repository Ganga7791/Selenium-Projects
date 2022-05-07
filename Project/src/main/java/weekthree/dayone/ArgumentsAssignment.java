package weekthree.dayone;

public class ArgumentsAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5, y =10;
		int c = 9;
		ArgumentsAssignment obj = new ArgumentsAssignment();
		System.out.println("multiply of x y argument is " +obj.multiply(x, y));
		System.out.println("square is " +obj.square(c));  
	}
	
	public int multiply (int a, int b)
	{
		return a + b;
	}
	
	public int square (int x)
	{
		return x * x;
	}

}
