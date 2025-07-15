package superkeyword;

public class SuperChild extends SuperVariable {
	String color="Blue";
	public void show() 
	{
		System.out.println(color);
	    System.out.println(super.color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChild obj=new SuperChild();
		obj.show();
		System.out.println(obj.c);

	}

}
