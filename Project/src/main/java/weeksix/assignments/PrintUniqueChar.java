package weeksix.assignments;

import java.util.HashSet;

public class PrintUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "google";
		char[] strcopy = str.toCharArray();
		HashSet unique = new HashSet();
		for (char ch : strcopy) {
			boolean isUniq = unique.contains(ch);
			// found duplicate
	    {
	    	if (isUniq) {
				unique.add(ch);
			}
				if (unique.contains(ch) == false) {
					unique.add(ch);
					System.out.println(ch);
					
				}		
			}
		}
	}
}

