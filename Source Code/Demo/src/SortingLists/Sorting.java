package SortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		int len1 =s1.length();
		int len2 = s2.length();
	if (len1>len2)
		return 1;
	else if(len2>len1)
		return -1;
	else
		return 0;
				
	}
	
}
public class Sorting {
	
	public static void main(String args[])
	{
		
	List<String> list = new ArrayList<String>();
	
	list.add("tiger");
	list.add("lion");
	list.add("zebra");
	list.add("giraffi");
	list.add("lamb");
	list.add("deer");
	
	Collections.sort(list, new StringComparator());
	
	for(String abc:list)
	{
		System.out.println(abc);
	}
	
	List<Integer> list1 = new ArrayList<Integer>();
	list1.add(9);
	list1.add(2);
	list1.add(35);
	list1.add(40);
	list1.add(22);
	list1.add(1);
	
	Collections.sort(list1);
	for(Integer abc:list1)
	{
		System.out.println(abc);
	}
		
	
	}

}
