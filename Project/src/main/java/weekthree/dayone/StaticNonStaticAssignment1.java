package weekthree.dayone;

public class StaticNonStaticAssignment1 {
	
	public static void m1()
	{
		System.out.println("Im static, calling static");
	    m3(); // same block , no obj needed
	}
	public void m2()
	{
		System.out.println("Im non static, calling static and non static methods");
		m3(); // come from stack, no obj needed
		m4(); // same block , no obj needed
		m1(); // come from stack, no obj needed
	}
	public static void m3()
	{
		System.out.println("Im static, calling non static method");
		StaticNonStaticAssignment1 obj = new StaticNonStaticAssignment1();
		obj.m2(); // comes from heap, obj needed
		obj.m4(); // comes from heap, obj needed
	}
	public void m4()
	{ 
		System.out.println("Im non static, calling static and non static methods");
		m1(); // come from stack, no obj needed
		m2(); // same block , no obj needed
		m3(); // come from stack, no obj needed
	}
	
	

}
