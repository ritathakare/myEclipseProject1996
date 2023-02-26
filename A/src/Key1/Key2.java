package Key1;

public class Key2 {
	static int a=22;
	       int b=23;
	void test()
	{
      int a=34;
      int b=45;
      System.out.println(a);
      System.out.println(b);
      System.out.println(Key2.a);
      System.out.println(this.b);
     
	}
public static void main(String[] args) {
	Key2 k=new Key2();
	Key2 h=new Key2();
	Key2 g=new Key2();
	k.a=212;
	k.b=111;//replace b by object k
	k.test();
	h.b=666;
	h.test();
	g.b=444;
	g.test();
	
}
}
