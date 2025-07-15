package stringpgm;

public class StringBufferpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("Hello");
		System.out.println(s);
		StringBuffer s1=new StringBuffer("Hii");
		System.out.println(s1);
		//insert() Insert some particular element
		s.insert(2,"lp");
		System.out.println(s);
		//replace() Replace 
		s.replace(2, 3, "b");
		System.out.println(s);
		s.replace(2, 7, "eman");
		System.out.println(s);
		//reverse()
		s1.reverse();
		System.out.println(s1);
		//delete()
		s1.delete(0, 1);
		System.out.println(s1);
		

	}

}
