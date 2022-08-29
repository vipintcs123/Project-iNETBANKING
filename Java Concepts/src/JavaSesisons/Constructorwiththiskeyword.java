package JavaSesisons;

public class Constructorwiththiskeyword {
	
	
	// class variables are initialized here with the current value of constructor using this keyword
	
	String name;
	int age;
	
	public Constructorwiththiskeyword(String name, int age) 
	{   
		this.name=name;
		this.age=age;
		
		System.out.println("Name is :"+name);
		System.out.println("Age is :" +age);
		
	}

	

	public static void main(String[] args) {


		Constructorwiththiskeyword obj = new Constructorwiththiskeyword("Vipin",30);
		
	}

}
