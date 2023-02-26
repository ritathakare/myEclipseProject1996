package Methodchain;

public class Executeflowers extends Lily {
	public static void main(String[] args) {
		Lily x= new Lily();
		
		Lavender y=x.beta();//lily
	     Jasmine n= y.alpha();
		    Rose s=n.demo();
		    // s.test();
		    x.beta().alpha().demo().test(); 
		     //Rhs =Lhs
		     
//instead of doing this we have to perform 
//method chaining in it.
	}
}
