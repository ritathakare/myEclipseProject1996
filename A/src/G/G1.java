package G;

public class G1
{
public static void main(String args[])
{
	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int e=11;
	
	System.out.println("Start");
	
	if(a>b)
	{
		if(a>c)
		{
			if(a>d)
			{
				if(a>e)
				{
					System.out.println("a is large");	
				}
				else
				{
					System.out.println("e is large");
				}
			}
			else
			{
				if(d>e)
				{
					System.out.println("d is large");	
				}
				else
				{
					System.out.println("e is large");
				}
			}
		}
		
		else
		{
			if(c>d)
			{
				if(c>e)
				{
					System.out.println("c is large");
				}
				else
				{
					System.out.println("e is large");
				}
			}
			else
			{
				if(d>e)
				{
					System.out.println("d is large");
		        }
				else
				{
					System.out.println("e is large");
				}
			}
		}
	}
	
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					if(b>e)
					{
						System.out.println("b is large");
					}
					else
					{
						System.out.println("e is large");
					}
				}
				else
				{
					if(d>e)
					{
						System.out.println("d is large");
			        }
					else
					{
						System.out.println("e is large");
		            }
				}
			}
			else
			{
				if(c>d)
				{
					if(c>e)
					{
						System.out.println("c is large");
					}
					else
					{
						System.out.println("e is large");
					}
				}
			else
			{
				if(d>e)
				{
					System.out.println("d is large");
				}
				else
				{
					System.out.println("e is large");
				}
			}

		 }
	  }
			
   }
		
}




