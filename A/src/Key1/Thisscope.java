package Key1;

public class Thisscope {
 
	static int a=12;
	       int b=34;
void test()
{
    int a=100;
	int b=200;
	System.out.println(a);//first cl goes to local var
	System.out.println(b);
	System.out.println("==========");
	
	System.out.println(Thisscope.a);//global var cl by cls name
	System.out.println(this.b);//non static global var cl wth this keyword
	System.out.println(this.a);
	System.out.println("==========");
	
}
	
public static void main(String[] args) {
	Thisscope t= new Thisscope();//t.b,t.test()
	Thisscope e= new Thisscope();
	t.a=111;//replace 12by 111
	e.b=222;//replace 34 by 222
	t.test();
	System.out.println("==========");
	e.test();
	
	
	
	
	
}
	    	
}

