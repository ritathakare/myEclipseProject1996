package Team;

public class Type {
	static void test() {
		System.out.println("static methods");
	
	    }
	void alpha() {
		System.out.println("Non static methods");
	}
    public static void main(String[] args)
    {
    	test();
    	Type.test();//alpha();
    	            //Type.alpha();
       Type x=new Type();//user defined is always called in main method 
                       //and declared before main method
       x.alpha();
    }
}
