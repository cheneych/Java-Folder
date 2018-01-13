package Equals;
class Person{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class App {

	public static void main(String[] args) {
		
		Person person1 = new Person(5,"Bob");
		Person person2 = new Person(5,"Bob");
		
		System.out.println(person1.equals(person2));
		
		double num1 = 5.4;
		double num2 = 5.4;
		
		System.out.println(num1==num2);
		
		String text1 = "Hello";
		String text2 = "Helloabcde".substring(0,5);
		
		
		System.out.println(text1.equals(text2)); 	

	}

}
