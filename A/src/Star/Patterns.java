package Star;

public class Patterns {
	
	public static void main(String[] args) 
	{
		int line=7;
		
		for(int b=1;b<=line;b++)//line
		{
			for(int a=(line-1);a>=b;a--)//space
			{
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++)  //star
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int b=line;b>=1;b--)
		{
			for(int a=(line-1);a>=b;a--)
			{
				System.out.print(" ");
			}
			for(int a=1;a<=b;a++) //star
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	 }
}