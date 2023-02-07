package Stringm;

public class Stringaut {
	public static void main(String[]args)
	{
	String a="Velocity";//constant pool area
	String b="Velocity";
	String c=new String("Velocity");
	String d=new String("Velocity");//non constant pool area
	System.out.println(a==b);
	System.out.println(c==b);
	System.out.println(a==d);
	System.out.println(b==d);
	System.out.println(a==c);
	System.out.println(c==d);//not equals bcz adreesing
	
	}
}
