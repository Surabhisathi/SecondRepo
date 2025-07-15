package aggregation;

public class AggreChil {
	int age;
	String subject;
	Aggrepar ref;
	public AggreChil(int age,String subject,Aggrepar ref)
	{
		this.age=age;
		this.subject=subject;
		this.ref=ref;
	}
	public void show()
	{
		System.out.println("The age is "+age);
		System.out.println("The subject is "+subject);
		System.out.println("The mark is "+ref.mark);
		System.out.println("The name is "+ref.name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggrepar obj2=new Aggrepar(43,"Anu");
		AggreChil obj=new AggreChil(18,"Maths",obj2);
		obj.show();
	}

}
