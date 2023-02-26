package Rename;

public class Return1 {
	static int a=89; //Global variables having 
	       int b=45;//  static and non static type*/
	
    static void pr() {
    	int d=67;  //Local variable
    	int c=76;
    	System.out.println(d);
    	System.out.println(c);
    }
     void alpha() {
    	 int g=90;
    	 System.out.println(g);
    	 
}
     public static void main(String[] args) {
    	 pr();
    	 
    	 Return1 x=new Return1();
    	 x.alpha();
         System.out.println(a);
         System.out.println(x.b);
         
        
     }
}
