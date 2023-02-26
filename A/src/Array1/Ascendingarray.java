package Array1;

public class Ascendingarray {
	public static void main(String[] args)
		{ 
		int a[]= {40,10,30,20};
		  int size=a.length;
		  for(int i=0;i<=(size-1);i++)
		  {
			  System.out.print(a[i]+",");
		  }
		     System.out.println();
      //Reverse array in ascending order
		 for(int i=0;i<=a.length-1;i++)
		    {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]>a[j])
				 {
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				 }
			   }
	        }
		     for(int i=0;i<=a.length-1;i++)
		     {
		    	 System.out.print(a[i]+",");
		     }
     }
}






