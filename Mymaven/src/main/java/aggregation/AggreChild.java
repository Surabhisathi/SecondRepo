package aggregation;

public class AggreChild {
	int mark;
	String subject;
	AggreParent ref;
	public AggreChild(int mark,String subject,AggreParent ref)
	{
		this.mark=mark;
		this.subject=subject;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("The mark is "+mark);
		System.out.println("The Subject is "+subject);
		System.out.println("The age is "+ref.age);
		System.out.println("The name is "+ref.name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AggreParent obj1=new AggreParent(17,"Surabhi");
		AggreChild obj=new AggreChild(45,"Science",obj1);
		obj.display();
				
	}

}
