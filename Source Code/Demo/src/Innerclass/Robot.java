package Innerclass;

public class Robot {

	private int id;

	public static class Battery {
		public void charge() {
			System.out.println("Battery Charging");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public class Brain {
		public void think() {
			System.out.println("Robot" + id + "is thinking");
		}
	}

	public void start() {
		System.out.println("Starting Robot" + id);

		Brain brain = new Brain();
		brain.think();
		String name = "Kumar";
		class Temp {
			public void doSomething() {
				System.out.println("ID is" + id);
				System.out.println("My Name is " +name);
			}
			
		}
	
		Temp temp = new Temp();
		temp.doSomething();
	}

}
