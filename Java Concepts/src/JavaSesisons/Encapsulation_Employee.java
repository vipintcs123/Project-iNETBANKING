package JavaSesisons;

public class Encapsulation_Employee {
	
	// private data variables  , these variables cannot access directly by outside the class
	
	private int ssn;
	private String empName;
	private int empAge;
	
	
	

	
	// Now we defined getter and setter : used to set and get the values of the fields, here we first set the data and then we get the data, 
	

	public int getSsn() {
		return ssn;
	}




	public void setSsn(int ssn) {
		this.ssn = ssn;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int empAge) {
		this.empAge = empAge;                    // this is used to hold the reefrence id of current object
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Encapsulation_Employee emp = new Encapsulation_Employee();
		emp.setEmpName("Vipin Shukla");
		emp.setEmpAge(24);
		emp.setSsn(123456);
		
		System.out.println("Employee name is: "+emp.getEmpName());
		System.out.println("Employee age is: "+emp.getEmpAge());
		System.out.println("Employee SSN is: "+emp.getSsn());
		
		
		
	}



}
