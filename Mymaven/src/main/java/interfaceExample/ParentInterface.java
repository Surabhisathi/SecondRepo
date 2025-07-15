package interfaceExample;

public interface ParentInterface {
	public static final int a=5;
	public abstract void show();
	default void print()
	{
		// cannot be assigned final a=6;
		System.out.println("This is second method");
	}
}

