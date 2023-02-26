package O1;

 public class Operand 
 {
	public static void main(String args[]) 
	{
		byte a=45;
		byte b=56;
		int x=78;
		
		int c=a+b;
		
		//c=a<b;//Not possible
		
		boolean d= a==b;
		System.out.println(d);
		
		boolean f=a<=x;
		boolean t=!d;
		System.out.println(t);
		System.out.println(b);
		a=b;
		System.out.println(a);
		System.out.println(b);
		
	}

}
