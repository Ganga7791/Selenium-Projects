package weeksix.assignments;

import java.util.HashSet;

public class FindDuplicateString {
	
	public static void main(String args[]) {
		
		String str = "google";
		char[] strcopy = str.toCharArray();
		HashSet duplicate = new HashSet();
		HashSet unique = new HashSet();
		for (char ch : strcopy) {
			boolean isUniq = !unique.contains(ch);
			if (isUniq) {
				unique.add(ch);
			}
				else {
					duplicate.add(ch);
					System.out.println(ch);
				}
			}
					
		}
		
		
	}
