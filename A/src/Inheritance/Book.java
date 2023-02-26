package Inheritance;
//Single Inheritance
public class Book{ //superclass
  static int a=20;
         int b=60;
   static void Demo()
   {
	System.out.println("Book is super class"); 
   }
public static void main(String[] args)
{
	Book.Demo();
	Book novel=new Book();/*Here novel is thse reference 
	                        variable for the object*/
	System.out.println(Book.a);
	System.out.println(novel.b);
}
}