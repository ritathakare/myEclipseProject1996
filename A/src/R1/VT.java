package R1;

public class VT{
	

public static void main(String args[])
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	
	System.out.println("Start");
	
	if(a>b)
	{
		if(a>c)
		{
			if(a>d)
			{
			System.out.println("a is large");	
			}
			else
			{
				System.out.println("d is large");
			}
		}
	}
	else
	{
		if(b>c)
		{
			if(b>d)
			{
				System.out.println("b is large");
			}
			else
			{
				System.out.println("d is large");
			}
		}
		else
		{
			if(c>d)
			{
				System.out.println("c is large");
			}
			else
			{
				System.out.println("d is large");
			}
		}
	}
}
	
}