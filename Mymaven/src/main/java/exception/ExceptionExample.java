package exception;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Arithmetic exception
		/*
		 * try { int a=5; int b=0; int c=a/b;
		 * System.out.println("the value of c is "+c); } catch(ArithmeticException c) {
		 * System.out.println("Exception handled"); } finally {
		 * System.out.println("Exit code"); }
		 */

		// ArrayIndexOutOfBounds Exception
		try {
			int ar[] = { 1, 2, 3, 4 };

			for (int i = 0; i < 5; i++) {
				System.out.println(ar[i]);
			}
		} catch (ArrayIndexOutOfBoundsException i) {
			System.out.println("Exception handled");
		} finally {
			System.out.println("Exit code");
		}

		// NullpointerException

		/*
		 * String s=null; System.out.println(s.length());
		 */
	}

}
