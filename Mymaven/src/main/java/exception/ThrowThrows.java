package exception;

public class ThrowThrows {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int age=16;
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new Exception("Not eligible");
			
		}
	}

}
