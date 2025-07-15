package collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>li=new ArrayList<String>();
		
		//add() To add particular elements in the collection
		li.add("Green");
		li.add("Yellow");
		li.add("Black");
		System.out.println(li);
		
		//set() to set particular elements based on index
		System.out.println(li.set(2, "Purple"));
		System.out.println(li);
	
		li.add("Yellow");
		System.out.println(li);
		
		//indexOf() return index of the particular element first occurrence
		System.out.println(li.indexOf("Yellow"));
		
		//lastIndexOf() last occurrence
		System.out.println(li.lastIndexOf("Yellow"));
		
		//get() to view element at the particular index
		System.out.println(li.get(0));
		
		//contains() to check whether an element is present or not
		System.out.println(li.contains("Green"));
		
		//isEmpty() check whether the list is empty or not
		System.out.println(li.isEmpty());
		
		for(int i = 0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		
		for(String col:li)
		{
			System.out.println(col);
		}
		
	}

}
