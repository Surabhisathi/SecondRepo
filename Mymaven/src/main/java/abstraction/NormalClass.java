package abstraction;

public class NormalClass extends AbsractClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsractClass obj=new NormalClass();
		obj.display();
		obj.show();
		// we cannot call the child class ppt by creating the parent class reference or object obj.print(); 
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	public void print()
	{
		System.out.println("Good");
	}

}
