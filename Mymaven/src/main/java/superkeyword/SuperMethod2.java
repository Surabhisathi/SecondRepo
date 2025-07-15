package superkeyword;

public class SuperMethod2 extends SuperMethod {
	public void print()
	{
		System.out.println("Supermethod");
		super.print();
		this.show();
	}
	public void show()
	{
		System.out.println("Method");
		super.display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMethod2 obj=new SuperMethod2();
		obj.print();
		//obj.display();
		//obj.show();
				

	}

}
