package condition;

public class Condition
{
 public static void main(String args[])
 {
	int a=87;
	int b=68;
	int c=776;
	System.out.println("start");
	if(a>b)//executes whenever condition 1=True
	{
		System.out.println("condition 1= True");
		if(a<c)
		{
			System.out.println("Hi");
		}
	}

	   System.out.println("End");
  }
 
}
