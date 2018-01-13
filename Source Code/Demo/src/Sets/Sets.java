package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		
		HashSet	<String> set = new HashSet<String>();
//		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		TreeSet<String> set2 = new TreeSet<String>();
		
		if(set.isEmpty())
		{
			System.out.println("Set is empty before insertions");
		}
		set.add("Monkey");
		set.add("Donkey");
		set.add("Buffalo");
		set.add("Cat");
		set.add("Dog");
		set.add("Crow");
		set.add("Lion");
		
		System.out.println(set);
		
		if(set.isEmpty())
		{
			System.out.println("Set is empty after insertions");
		}
		
		if(set.contains("Lala"))
		{
			System.out.println("Object found");
		}
		
		set2.add("Monkey");
		set2.add("Donkey");
		set2.add("Tiger");
		set2.add("Car");
		set2.add("Dog");
		set2.add("Crab");
		set2.add("Lion");	
		
		System.out.println(set2);

		Set<String> insertion = new HashSet<String>(set);
		
		System.out.println(insertion);
		
		insertion.retainAll(set2);
		
		System.out.println(insertion);
		
		Set<String> difference = new HashSet<String>(set);
		
		difference.removeAll(set2);
		System.out.println(difference);
		
		
	}

}
