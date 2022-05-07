package weeksix;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LinkedListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> linkobj = new LinkedList();
		linkobj.add(1);
		linkobj.add(1);
		linkobj.add(1);
		
		Set<Integer> set  = new HashSet<>();
		set.add(1);
		set.add(2);
		
		Map<String, String> map = new HashMap();
		map.put("test", "test");
		
		print(linkobj);
		print(set);
	}
	
	
	public static List print(Collection<Integer> list) {
		for(Integer ii: list) {
			System.out.println(ii);
		}
		return null;
	}

}
