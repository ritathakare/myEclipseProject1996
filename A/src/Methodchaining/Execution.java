package Methodchaining;

public class Execution {
	public static void main(String[] args) {
		Viraj v=new Viraj();
		
		Neha n=v.alpha();
		
		Rita r=n.demo();
	
		r.test();
//to avoiding this multiple lines we do method chaining 
//one method is the returntype of another method
		v.alpha().demo().test();
	}

}
