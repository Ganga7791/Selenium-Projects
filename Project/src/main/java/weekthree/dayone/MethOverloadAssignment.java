package weekthree.dayone;

public class MethOverloadAssignment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethOverloadAssignment obj = new MethOverloadAssignment();
	    obj.multiply(7,7);   
	    obj.multiply(5,6,7);  
	    System.out.println("Addition of int data type " +add(17,13));  
	    System.out.println("Addition of double data type " +add(10.4,10.6)); 
	}
		public void multiply(int a, int b) // same method name different arguments
		{
			System.out.println("a * b is " +(a*b));	
		}
		public void multiply(int a, int b, int c)
		  {
		    System.out.println("a * b * c is " +(a*b*c));
		  }
		
		public static int add(int a, int b) // same method name different data type
		{
			int ans=a+b;
			return ans;
		}
		public static double add(double c, double d)
		{
			double ans = c+d;
			return ans;
		}		
}
