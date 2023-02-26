package Inheritance;

//Multilevel Inheritance
public class Booktype extends Author {
	static int d=40;
	static void test1()
	{
	 System.out.println("Booktype is sub class");	
	}
   public static void main(String[] args)
   {
	 Booktype.test1();
	 System.out.println(Booktype.a);
	 System.out.println(Booktype.c);
   }
  
}

/*Here we r inheriting the properties from
 * Super class author and also from the
 * supermost class Book*/
 