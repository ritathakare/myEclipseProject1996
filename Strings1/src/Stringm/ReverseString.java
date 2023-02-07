package Stringm;

public class ReverseString {
public static void main(String[] args) {
 String a="Velocity";
  char result[]=a.toCharArray();
  String r="";
 // for(int i=0;i<result.length;i++)
 // {
	//  System.out.println(result[i]);
 // }
  //array reverse string logic
  //array to string
  for(int i=(a.length()-1);i>=0;i--)
  {
	  r=r+result[i];
  }
  System.out.println(r);
  }
 

}
