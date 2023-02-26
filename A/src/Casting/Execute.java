package Casting;

public class Execute {
	public static void main(String[] args) {
		Upcasting u=new Subup();
		u.test();
		u.demo();
		//u.alpha();//we can't upcast the
		          //new declared property of subclass
	}

}
