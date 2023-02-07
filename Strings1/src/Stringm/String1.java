package Stringm;
//case sensitive method 
public class String1 {
	public static void main(String[] args) {
String a="Velocity Pune";//constant pool area
String b="velocity";
String c=new String("Velocity");
String d=new String("Velocity");
boolean result=a.equals(b);//non static
System.out.println(result);
result= a.equalsIgnoreCase(b);
System.out.println(result);
int size=a.length();
System.out.println(size);
char result1=a.charAt(4);
System.out.println(result1);
String result2=a.concat(d);
System.out.println(result2);
result2=a.concat("class");
System.out.println(result2);
int result3=a.indexOf('u');
System.out.println(result3);
result3=a.indexOf("Pune");
System.out.println(result3);
result3=a.indexOf('s');
System.out.println(result3);
boolean result4=a.contains("class");
System.out.println(result4);
String result5=a.replace("Pune","katraj");
System.out.println(result5);
String result6=a.replace('e','z');
System.out.println(result6);
String result7=a.toLowerCase();
System.out.println(result7);
String result8=a.toUpperCase();
System.out.println(result8);
String result9=a.substring(5,11);
System.out.println(result9);
boolean result10=a.isEmpty();
System.out.println(result10);
String result11=a.substring(7);
System.out.println(result11);
boolean result12=a.startsWith("Velo");
System.out.println(result12);
boolean result13=a.endsWith("une");
System.out.println(result);












	}

}
