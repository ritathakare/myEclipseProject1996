package Demo;

public class Mock {
	public static void main(String[]args)
	{
	
	int a[]= {40,10,20,30};
	int size = a.length;
	for(int i=0;i<=(size-1);i++)
	{
		System.out.print(+a[i]+",");
	}
	System.out.println();
	for(int i=0;i<=a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]<a[j])
			{
				int c=a[i];
				a[i]=a[j];
				a[j]=c;
			}
		}
	 }
	for(int i=0;i<=(size-1);i++)
	{
		System.out.print(+a[i]+",");
	}

}
}
