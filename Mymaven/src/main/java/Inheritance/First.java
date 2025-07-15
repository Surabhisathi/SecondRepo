package Inheritance;

public class First extends Second{

	public void show()
	{
		System.out.println("First is the child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First obj=new First();
		obj.show();
		obj.display();
		obj.sum(3,5);
	}

}
