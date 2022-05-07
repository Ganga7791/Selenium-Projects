package weeksix.assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str = "google";
          LinkedHashSet<Character> set = new LinkedHashSet<Character>();
          for(int i=0; i<str.length();i++) {
      		set.add(str.charAt(i));
      	}
          for (char x : set) {
      		System.out.println(x);
      	}
	
	}

}
