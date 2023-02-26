package Array1;

public class Reversearray {
	public static void main(String[] args)
	{
		int a[]= {34,4,5,6,};
		               
		int size=a.length;
		  for(int i=0;i<=(size-1);i++)
		     {
			  System.out.print(a[i]+",");
		     }
		  //Reverse array
		  
		 for(int i=0;i<a.length/2;i++)
		 {
			 int c=a[i];
			 a[i]=a[(a.length-1)-i];
			 a[(a.length-1)-i]=c;
		 }
		System.out.println();
		for(int i=0;i<=(size-1);i++)
		{
			System.out.print(a[i]+",");
		}
	}
}
			 
