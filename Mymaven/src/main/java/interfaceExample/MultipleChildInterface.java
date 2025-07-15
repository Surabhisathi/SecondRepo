package interfaceExample;

public class MultipleChildInterface implements Multiple1Interface,Multiple2Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleChildInterface obj=new MultipleChildInterface();
		obj.display();
		obj.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is print method");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is display method");
	}

}
