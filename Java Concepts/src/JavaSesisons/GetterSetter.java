package JavaSesisons;

class MyEmployee{
	
	private int id;
	private String name;
	
	
	
	
	public String getName()
	{
		return name;
		
	}
	
	
	
	
	public void setName(String i)   // we also put validation in setter method 
	{
		name = i;
		
	}
	
	
	
	
	public void setId(int i)    // we also put validation in setter method
	{
		id = i;
		
	}
	
	
	
	public int getId()
	{
		return id;
		
	}
	
	
}






public class GetterSetter {

public static void main(String[] args) {
	
	MyEmployee emp = new MyEmployee();


	 emp.setName("Vipin Shukla");
     System.out.println(emp.getName());
     
     
     emp.setId(5);
     System.out.println(emp.getId());
     
	 

	}

}
