package Inheritance;

public class HeiraChild2 extends HeiraParent  {
	public void display()
	{
		System.out.println("Second child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeiraChild2 obj=new HeiraChild2();
		obj.display();
		obj.print();
	}

}
