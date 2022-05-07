package weeksix.assignments;

public class PrintCharInOddPlace {

	public static String main(String[] args) {
		// TODO Auto-generated method stub

		String str = "google";
		str = printoddchar(str);
		System.out.println(str);
		return str;
		
	}
	
	private static String printoddchar(String s) {
		// TODO Auto-generated method stub
		String temp = "";
		for(int i=0; i<s.length();i++)
		{
			if(i%2 == 1);
			continue;
		}
		return temp;
	}
}
