package abstraction;

public class AbsChild extends AbsParent {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsChild obj=new AbsChild();
		obj.sum(5, 6);
		obj.diff(5.2f, 3.2f);
	}


	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println("The sum is "+c);
	}


	@Override
	public void diff(float a, float b) {
		// TODO Auto-generated method stub
		float c=a-b;
		System.out.println("The difference is "+c);
	}

}
