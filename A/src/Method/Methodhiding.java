package Method;
//sub class
public class Methodhiding extends Methodoverriding1{
	static void test()//declaration
	{
	 System.out.println("Pune");//defination
	}
	public static void main(String[] args) {
		Methodoverriding1.test();
		Methodoverriding.test();
		//Methodoverriding.test();
		Methodhiding.test();
  }
}
