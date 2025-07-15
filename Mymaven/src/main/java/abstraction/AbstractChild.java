package abstraction;

public class AbstractChild extends AbstractParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractChild obj=new AbstractChild();
		obj.display();
		obj.show();
		obj.print();
		obj.save();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is the abstract class method");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is the second abstract  class");
	}
	public void save()
	{
		System.out.println("This is also a normal method");
	}

}
