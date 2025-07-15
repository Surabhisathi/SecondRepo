package encapsulation;

public class EncapChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapParent obj=new EncapParent();
		obj.setAge(18);
		System.out.println("The age is "+obj.getAge());
		obj.setSubject("Maths");
		System.out.println("The subject is "+obj.getSubject());
	}

}
