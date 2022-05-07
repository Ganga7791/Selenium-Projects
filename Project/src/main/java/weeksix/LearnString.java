package weeksix;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s1 = new String("Liberty");
		
		String s2 = new String("Liberty");
		
		String s3 = new String("liberty");
		
		System.out.println(s1.hashCode());
		
		System.out.println(s2.hashCode());
		
		System.out.println(s3.hashCode());
		
		String str = s1.concat(" Technologies");
		
		System.out.println(s1);
		
		
		StringBuffer sb1 = new StringBuffer("Liberty");
		
		StringBuffer sb2 = new StringBuffer("Liberty");
		
		System.out.println(sb1.hashCode());
		
		System.out.println(sb2.hashCode());
		
		sb1.append(" Technologies");
		
		sb1.append(" Chenani");
		
		System.out.println(sb1);
		
		
		StringBuilder sb3 = new StringBuilder("Liberty");
		
		StringBuilder sb4 = new StringBuilder("Liberty");
		
		System.out.println(sb3.hashCode());
		
		System.out.println(sb4.hashCode());
		
		sb3.append(" Technologies");
		
		sb3.append(" Chenani");
		
		System.out.println(sb3);
	}

}
