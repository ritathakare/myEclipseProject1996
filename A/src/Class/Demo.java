package Class;

public class Demo {
	
	 public static void main(String[] args)
	  {
		int a[]={4,2,7,3};
		int size= a.length;
		for(int i=0;i<=(size-1);i++)
		{
		 System.out.print(a[i]+",");	
		}
		for(int i=0;i<a.length;i++)
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
		System.out.println();
		for(int i=0;i<=(a.length-1);i++)
		{
		System.out.print(a[i]+",");
		}
			
		
	  }
}