package weekthree.dayone;

public class StaticNonStaticAssignment2 {
	
	public static void m5() // Static - Static
	{
		StaticNonStaticAssignment1.m1(); // comes from stack no obj needed specify classname alone
		StaticNonStaticAssignment1.m3(); // comes from stack no obj needed specify classname alone
	}
	public static void m6() // Static - NonStatic
	{
		StaticNonStaticAssignment1 obj = new StaticNonStaticAssignment1();
		obj.m2(); // comes from heap, obj needed
		obj.m4(); // comes from heap, obj needed
	}
	public void m7() // Non Static - Static
	{
		StaticNonStaticAssignment1.m1(); // comes from stack no obj needed specify classname alone
		StaticNonStaticAssignment1.m3(); // comes from stack no obj needed specify classname alone
	}
	public void m8() // Non Static - Non Static 
	{
		StaticNonStaticAssignment1 obj = new StaticNonStaticAssignment1();
		obj.m2(); // comes from heap, obj needed
		obj.m4(); // comes from heap, obj needed
	}
}
