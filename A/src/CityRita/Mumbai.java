package CityRita;

public class Mumbai {
	public static int a=23;
    static int b=56;
private static int c=78;
protected int d=45;
	public String x;
	public void test1() //public method
	{
     System.out.println("Hi");
	}
	 void test2()//default method
	{
		System.out.println("Hello");	
	}
	private void test3()//private method
	{
		System.out.println("Velocity");
	}
	protected void test4() //protected method
	{
		System.out.println("Pune");
	}
	public Mumbai()//constructor
	 {
		x="public constructor"; 
	 }
	 Mumbai(int a)
	 {
	  x="Default constructor";
	 }
	 private Mumbai(String b)
	 {
		 x="private constructor";
	 }
	 protected Mumbai(float c)
	 {
		 x="protected constructor";
	 }
	
	public static void main(String[] args) {

		Mumbai m1=new Mumbai();
		m1.test1();//method
		m1.test2();
	    m1.test3();
		m1.test4();
		System.out.println(m1.d);
		Mumbai p=new Mumbai();
		Mumbai q=new Mumbai(12);
		Mumbai r=new Mumbai("Velocity");
		Mumbai s=new Mumbai(3.566f);
		
		System.out.println(p.x);
		System.out.println(q.x);
		System.out.println(r.x);
		System.out.println(s.x);
	
	}

}
