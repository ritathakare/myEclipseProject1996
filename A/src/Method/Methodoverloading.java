package Method;
//super class
public class Methodoverloading {
	void test() {//non static method
		System.out.println("hello");
	}
	 void test(int a) {
	System.out.println("hi");	
	}
	 static void test(float x)
	 {
	  System.out.println("katraj"); 
	 }
	public static void main(String[] args) {
Methodoverloading m=new Methodoverloading();
	 m.test();
	 m.test(40);
	 Methodoverloading.test(2.344f);
	 
     
	}
}
