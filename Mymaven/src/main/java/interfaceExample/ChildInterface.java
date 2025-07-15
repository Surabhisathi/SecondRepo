package interfaceExample;

public class ChildInterface implements ParentInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInterface obj=new ChildInterface();
		obj.show();
		obj.print();
		obj.display();
		//reference creation
		ParentInterface obj1=new ChildInterface();
		obj1.print();
		obj1.show();
		//we cannot access child from parent object or reference obj1.display();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is first method");
	}
	public void display()
	{
		System.out.println("This is third method");
	}

}
