package Inheritance;

public class HeiraChild1 extends HeiraParent {
	public void show()
	{
		System.out.println("First child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeiraChild1 obj=new HeiraChild1();
		obj.show();
		obj.print();
	}

}
