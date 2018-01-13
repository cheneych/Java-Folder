package Reccursion;

public enum Enum {
	Hello("Hi"), Hi("How"), How("Are"), Are("You"), You("End");

	String name;

	public String getName() {
		return name;
	}

	Enum(String name) {
		this.name = name;
	}
}
