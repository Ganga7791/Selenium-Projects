package weeksix.assignments;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		 StringBuilder str = new StringBuilder();
	        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
	            if (i < s1.length())
	                str.append(s1.charAt(i));
	            if (i < s2.length())
	                str.append(s2.charAt(i));
	            System.out.println(s1);
	            System.out.println(s2);
	        }
	}

}
