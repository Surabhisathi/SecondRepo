package Inheritance;

public class Multichild extends MultiIntermediate {
	public void display()
	{
		System.out.println("Multichild is the child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multichild obj=new Multichild();
		obj.display();
		obj.show();
		obj.print();

	}

}
