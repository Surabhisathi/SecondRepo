package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("yellow");
		li.add("black");
		li.add("blue");
		li.add("green");
		System.out.println(li);
		ArrayList<String> ci=new ArrayList<String>();
		ci.add("apple");
		ci.add("orange");
		ci.add("kiwi");
		System.out.println(ci);
		
		//addAll() Add 2 list
		System.out.println(li.addAll(ci));
		System.out.println(li);
		
		//containsAll() check whether a list contain another list
		System.out.println(li.containsAll(ci));
		
		//remove() remove an element from the list based on the index
		ci.remove(2);
		System.out.println(ci);
		System.out.println(li);
		
		Iterator itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		itr.remove();
		System.out.println(li);
		
	}

}
