package Inheritance;
//Sub class
public class Author extends Book {
 static int c=70;
 static void test() {
	 System.out.println("Author is sub class");
 }
 
public static void main(String[] args)
{
	Author.test();
	Author x=new Author();/* Here we can also 
	          call the properties of book class through 
	         author class object due to inheritance*/
	System.out.println(Author.c);	
    System.out.println(Author.a);
    System.out.println(x.b);
}
}
