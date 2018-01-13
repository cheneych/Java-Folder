package ArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String args[]) {

		List<Integer> arraylist = new ArrayList<Integer>();
		List<Integer> linkedlist = new LinkedList<Integer>();

		// numbers.add(10);
		// numbers.add(20);
		// numbers.add(40);

		doSomething("Arraylist", arraylist);
		doSomething("Linkedlist", linkedlist);

	}

	public static void doSomething(String type, List<Integer> list)
	{
		
//		System.out.println("1st Iteration");
		
		long start = System.currentTimeMillis();
		
		for (int i=0; i<1E5; i++)
		{
			list.add(0,i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken " +(end - start)+" for "+ type);
		
//		System.out.println("1st Iteration");
//		for (int i=0; i<1E5; i++)
//		{
//			list.add
//			System.out.println(numbers.get(i));
//		}
//		
//		numbers.remove(numbers.size()-1);
//		System.out.println("2nd Iteration");
//		
//		for (Integer value:numbers)
//		{
//			System.out.println(value);
//		}
//		
//		numbers.remove(0);
//		
//		for (Integer value:numbers)
//		{
//			System.out.println(value);
//		}
		
		
	}

}
