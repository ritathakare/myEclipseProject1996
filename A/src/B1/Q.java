package B1;

public class Q {
	
	public static void main(String args[])
	{
		int a=55;
		int b=404;
		int c=33;
		
		
		System.out.println("Start");
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is large");
			}
			else
			{
				System.out.println("c is large");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("b is large");
			}
			else
			{
				System.out.println("c is large");
			}
		}
		    System.out.println("End");
	}
}