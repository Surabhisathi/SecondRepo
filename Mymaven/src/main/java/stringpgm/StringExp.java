package stringpgm;

public class StringExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
		String s1=new String("Night");
		System.out.println(s);
		System.out.println(s1);
		//length(To calculate the size or length of the string)
		System.out.println(s.length());
		//concat method
		System.out.println(s.concat(s1));
		//Contains() 	Whether an character is present or not,it written true or false value
		System.out.println(s.contains("e"));
		System.out.println(s.contains(s1));
		String v="java";
		String a="java";
		String b="Java";
		String c="celenium";
		String f="";
		//equals() method: Whether the value is equal or not
		System.out.println(v.equals(a));
		System.out.println(b.equals(c));
		System.out.println(b.equals(a));
		//equalsIgnoreCase()  Ignore the case
		System.out.println(a.equalsIgnoreCase(b));
		//toUpperCase() To covert small letter to capital letter
		System.out.println(v.toUpperCase());
		//toLowerCase()
		System.out.println(v.toLowerCase());
		//isEmpty() Whether an string is empty or not
		System.out.println(v.isEmpty());
		System.out.println(f.isEmpty());
		//valueOf() covert any data type into string
		int h=5;
		System.out.println(String.valueOf(h));
		//==
		System.out.println(v==a);
		String s2="Night";
		//== it compare the reference not the object or values
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		

	}

}
