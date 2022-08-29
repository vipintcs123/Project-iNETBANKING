package JavaSesisons;

public class B extends A {    // B is a child of A

	
	public B()
	{
		super();     // It call default parent class constructor   
	
		
	}
	
	
	public B(int i)
	{
		
		super(i);   // It call one argument parameterized parent class constructor
		
		
	}
	
	

	public B(int i, int j)
	{
		
		super(i,j);  // It call two argument parameterized parent class constructor
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		B obj = new B();  
	
		// here first it goes to a child class constructor but in child class constructor super(10) is used so it goes to a parent class parameterized constructor
		
		B obj1 = new B(10);  // one parameter constructor is called
		
		B obj2 = new B(10,20);   // two parameter constructor is called
	}
	
	
}
