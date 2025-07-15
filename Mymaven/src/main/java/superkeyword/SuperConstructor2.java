package superkeyword;

public class SuperConstructor2 extends SuperConstructor {
	public SuperConstructor2()
	{
		super();
		System.out.println("This is the child class");
	}
	public SuperConstructor2(int b)
	{
		super(4);
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConstructor2 obj=new SuperConstructor2();
		SuperConstructor2 obj1=new SuperConstructor2(6);
	}

}
