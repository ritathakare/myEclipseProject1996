package Star;

public class Pharo {
	public static void main(String[] args) {
		
	
	for(int a=1; a<=7;a++) // Outer for loop for upper part
	{
	for(int k=6;k>=a;k--) // Spacing in decreasing format 
	{
	System.out.print(" ");
	}
	for(int p=1;p<=a;p++) // Star pattern in increasing format(left side)
	{
	System.out.print("*");
	}

	for(int b=1;b<=5;b++) // Vertical Rectangle space in the upper middle side
	{
	System.out.print(" ");
	}
	for(int q=1;q<=a;q++) // Star pattern in increasing format(right side)
	{
	System.out.print("*");
	}
	System.out.println(" "); // This spacing is very crucial for all the for loops to print on next line
	}

	for(int t=1;t<=5;t++)
	{
	for(int y =1;y<=5;y++)
	{
	System.out.print(" "); // Horizontal rectangle space in the middle format 
	}
	}

	for(int j=1;j<=8;j++) // Outer loop for the lower part 
	{
	for(int m=3;m<=j;m++) // spacing in Increasing format 
	{
	System.out.print(" ");
	}

	for(int l=8; l>=j; l--) // Star patter in Decreasing format (Left side) 
	{
	System.out.print("*");
	}
	for(int d=1;d<=5;d++) // Vertical Rectangular spacing in lower middle side  
	{
	System.out.print(" ");
	}

	for(int u=8;u>=j;u--) // Star pattern in decreasing format (Right side) 
	{
	System.out.print("*");
	}
	System.out.println(" "); // This spacing is very crucial for all the for loops to print on next line
	}


}
}