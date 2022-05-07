package weeksix.assignments;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class FindDuplicateStringCopy {

	public static void main(String[] args) {
		Collection duplicates = null;
		
		duplicates = version2("google");
		print(duplicates);
		
		duplicates = version2("doogle");
		print(duplicates);
	}
	
	public static HashSet version2(String subject) {
        char[] copy_str = subject.toCharArray();
		HashSet unique = new HashSet();
		HashSet duplicate = new HashSet();
		for (char ch : copy_str) {
			boolean isUniq = !unique.contains(ch);
			if(isUniq) {
				unique.add(ch);
			} else {
				duplicate.add(ch);
			}
		}
		
//		System.out.println("************");
//		print(unique);
//		print(duplicate);
		
		return duplicate;
	}

	
	public static void version1() {
		String name = "gooogle";
		char[] namecopy = name.toCharArray();
		LinkedList unique = new LinkedList();
		LinkedList duplicate = new LinkedList();
		for (char ch : namecopy) {
			boolean isUniq = !unique.contains(ch);
			// found duplicate
			if (isUniq) {
				unique.add(ch);
			} else {
				if (duplicate.contains(ch) == false) {
					duplicate.add(ch);
				}
			}
//			System.out.println("************");
//			print(unique);
//			print(duplicate);
		}
	}

	private static void print(Collection cl) {
		cl.stream().forEach(System.out::print);
		System.out.println();
	}

}
