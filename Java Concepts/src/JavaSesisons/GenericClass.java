package JavaSesisons;


class MyData<T>     // This is called type parameter section  , we can also make more than one placeholder like class MyData<T1,T2>
{
	T i;                         // T is a placeholder for data type
	
	public void add(T i1)
	{
		i = i1;
		
	}
	
	
	
	public T get()   // T is a placeholder for data type
	{
		
		return i;
		
	}
	
	
}



public class GenericClass {
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {


       MyData<Integer> m1 = new MyData<Integer>();        //<Integer>  - Now <T> act as a integer in whole class, here we can use only non primitive types , primitive types like int, float are not allowed
       MyData<String> m2 = new MyData<String>();        //<Integer>  - Now <T> act as a String in whole class
       m1.add(5);
	   m2.add("Rahul");
	   System.out.println("m1 = "+m1.get());
	   System.out.println("m2 = "+m2.get());
	   
	}

}
