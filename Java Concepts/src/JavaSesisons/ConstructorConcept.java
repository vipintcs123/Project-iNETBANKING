package JavaSesisons;

public class ConstructorConcept {
	
	
	
	public ConstructorConcept()   // Default constructor
	{
		
		System.out.println("Default constructor");
		
	}
	
	
	

	public ConstructorConcept(int i)   //single  parameterized constructor
	{
		
		System.out.println("single parameter constructor");
		System.out.println("the value of i is " +i);

		
	}
	
	
	
	public ConstructorConcept(int i, int j)   // two parameterized constructor, here we overloaded the constructor by passing an arguments
	{
		
		System.out.println("two parameter constructor");
		System.out.println("the value of i is " +i);
		System.out.println("the value of j is " +j);

		
	}



	public static void main(String[] args) {


		ConstructorConcept obj = new ConstructorConcept();  // here default constructor is called
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

	}

}
