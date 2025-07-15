package MethodOverriding;

public class MethodChild extends MethodParent{
	public void display()
	{
		super.display();
		System.out.println("This is child ");
	}
	/*public void show(int a)
	{
		super.show(5);
		System.out.println("The value of a is "+a);
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodChild obj=new MethodChild();
		obj.show(2);
		obj.display();
	}


	@Override
	public void show(int a) {
		// TODO Auto-generated method stub
		super.show(5);
		System.out.println("The value of a is "+a);
		
	}

}
