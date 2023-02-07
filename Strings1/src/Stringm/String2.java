package Stringm;

public class String2 {
	public static void main(String[] args) {
		String a="Velocity Class Pune";
		String b="";
		String c=" ";
		String d=null;
		String []result=a.split("Class");
		
	for(int i=0;i<result.length;i++)
	{
	System.out.println(result[i]);	
	}
	System.out.println("-----------");	
	
	result=a.split(" ");
	
	for(int i=0;i<result.length;i++)
	{
	 System.out.println(result[i]);
	}
	}

}
