package Star;

public class Diamond 
{
  public static void main(String[] args)
  {
	  int line=10;
	  for(int b=1;b<=line;b++) //line
	  {
		  for(int a=(line-1);a>=b;a--) //space
		  {
			  System.out.print(" ");
		  }
		  for(int a=1;a<=b;a++)  //start
		  {
			  System.out.print("* ");
		  }
		    System.out.println();
	  }
	  for(int b=9;b>=1;b--)
	  {
		  for(int a=(line-1);a>=b;a--)
		  {
			  System.out.print(" ");
		  }
		  for(int a=1;a<=b;a++)
		  {
			  System.out.print("* ");
		  }
		  
		  System.out.println();
	  }
	  

  }
}
