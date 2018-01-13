package AbstractClass;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("Car Started");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Car is in motion");
		
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
		
	}

}
