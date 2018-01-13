package Iterator;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteration {

	public static void main(String[] args) {
		
		LinkedList<String> animals = new LinkedList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("puppy");
		
		Iterator<String> it = animals.iterator();
		
		while(it.hasNext()){
		
			String value = it.next();
				System.out.println(value);
				
				if(value == "cat")
					it.remove();
		}
		
		
		for (String animal: animals)
			System.out.println(animal);

	}

}
