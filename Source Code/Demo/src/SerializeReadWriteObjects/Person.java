package SerializeReadWriteObjects;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = -1039015407410349947L;
	private transient int id;
	private String name;
	public static int count;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "] Count is " +count;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}
	
	
	
}
