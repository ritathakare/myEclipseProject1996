package A1Rita;

public class ASCII {
   // int a;
	public static void demo(int y)
	{
		System.out.println("public");
		System.out.println(y);
	}
	private static void demo(char h)
	{
		System.out.println("private");
		System.out.println(h);
	}
	public static void main(String[] srgs)
	{  int a;
		ASCII v=new ASCII();
		ASCII.demo(12);
		ASCII.demo('&');
	    a='&';
		System.out.println(a);
	}

}
