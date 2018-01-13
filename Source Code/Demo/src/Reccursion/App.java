package Reccursion;

public class App {

	public static void main(String args[])
	{
//	
//		Enum abc = Enum.Hello;
//	
//	System.out.println(Enum.Hello);
//	System.out.println(Enum.Hello.getClass());
//	System.out.println(Enum.Are.getName());
	
		
		
	System.out.println(factorial(3));
	}
private static int factorial(int value)
  {
	  System.out.println(value);
	  if(value ==1)
	  {
		  return 1;
	  }
	  return factorial(value-1)*value;
  }

}

