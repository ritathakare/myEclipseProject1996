package Enc;

public class Enc1 {
	private static int a=12;
	private int b=56;
	private int c=34;
	
	public Enc1()//constructor
	{
	  b=34;/*Here it hides data of 
	        globally declared var b=56 & c=34*/
	  c=14;
	}
	public Enc1(int s)
	{
		a=23;
		b=32;
		c=42;
	}
	public void add()
	{
	 int x=b+c+a;
	 System.out.println(x);
	}

}
