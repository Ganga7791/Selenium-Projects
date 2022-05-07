package weekthree.dayone;

public class ReturnTypeAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTypeAssignment obj = new ReturnTypeAssignment();
		System.out.println("addition " +add(5,5));
		System.out.println("multiply " +obj.multiply(7,9)); // static - non static obj created
	}
	
	public static int add (int a, int b)
	{
		return a + b; // returns expression of arg
	}
    
	public int multiply (int x, int y)
	{
		int z = x *y;
		return z; // return int 
	}
}
