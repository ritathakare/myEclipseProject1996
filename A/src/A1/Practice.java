package A1;

public class Practice {
	public static void main(String[] args)
	{
		int i,j,count;

		for(i=1;i<=100;i++)//how many nos we want to print
		{
			count=0;
			for(j=1;j<=i;j++) // condition to checkout prime nos.
			{
				if(i%j==0)
			     count++;
			}
		      if(count==2)
			{
				System.out.println(i);//here i print the prime no.
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int n=7;
//		int temp=0;
//		for(int a=2;a<=n-1;a++)
//		{
//			
//								
//         if(n%a==0)//provide reminder o so its not prime
//			{
//	         temp=temp+1;
//			}
//			
//		}
//		if(temp==0)
//		{
//		System.out.println("number is prime");
//	    }
//	  else
//	   {
//		System.out.println("number is not a prime");	
//	   }
  //}
//}