package weeksix.assignments;

import java.util.HashSet;

public class RepeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "google";
        char[] arr = str.toCharArray();
        System.out.println(firstRepeating(arr));
	}
    
	public static char firstRepeating(char str[]) {
		// TODO Auto-generated method stub
		 HashSet<Character> set = new HashSet<>();
	        for (int i=0; i<=str.length-1; i++)
	        {
	        	  char c = str[i];
		            if (set.contains(c))
		               return c;
		            else
		                set.add(c);
	        }
	        return '\0';
	}

}
