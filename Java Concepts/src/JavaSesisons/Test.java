package JavaSesisons;

class P
{
	
	String s = "Parent Variable";
	
}




class C extends P

{
	
String s = "Child Variable";


public void m1()
{
	
	System.out.println(s);
	System.out.println(this.s);    // refer to a current class instance variable
	System.out.println(super.s);  // refer to a parent/super class instance variable
	
	
	
}

}




public class Test {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();

	}

}
