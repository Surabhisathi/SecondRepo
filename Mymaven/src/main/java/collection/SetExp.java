package collection;

import java.util.HashSet;
import java.util.Set;

public class SetExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();	
		//add
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		System.out.println(s);
		Set<String> s1=new HashSet<String>();	
		//add
		s1.add("apple");
		s1.add("orange");
		s1.add("kiwi");
		s1.add("berry");
		System.out.println(s1);
		
		//addAll()
		System.out.println(s.addAll(s1));
		System.out.println(s);
		
		//contains()
		System.out.println(s.contains("orange"));
		
		//containsAll()
		System.out.println(s.containsAll(s1));
		System.out.println(s.isEmpty());
		
		System.out.println(s.remove("one"));
		System.out.println(s);
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		System.out.println(s.isEmpty());
		s1.add("kiwi");
		System.out.println(s1);
	}

}
