package JavaSesisons;




public class ExampleGenericMethod {

		public <E> void printArray(E  []s)   // Here <E> is a placeholder, during binding it decides which value comes during calling
		{
			
			for(E x:s)   // foreach loop used to access array sequentially, this loop run as values present in array, in x all values of array come one by one
				         // Hhere E is work as a data type like string, int, float, etc
				
			System.out.println(x);
				
	    }
				
		
public static void main(String[] args) {	
		
		ExampleGenericMethod e1 = new ExampleGenericMethod();
		
		String countries[] = new String[] {"India", "pakistan", "Nepal"};
		
		Integer numbers[] = {12,34,56,77};
		
		e1.printArray(countries);
		e1.printArray(numbers);
		
		
}

	
}
