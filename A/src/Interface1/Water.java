package Interface1;

public interface Water {
	int  a=34;
	void test();//abstract method of interface
	default void alpha()
	{
	 System.out.println("Hi");
	}
}
