package MethodInt;

public class Execution {
	public static void main(String[] args) {
		InterM3 x=new Method3();
		
		InterM2 y=x.alpha();
		InterM1 z=y.demo();
		z.test();
	//Method chaining
		x.alpha().demo().test();
	}

}
