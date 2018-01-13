package AbstractClass;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera Started");
		
	}

	@Override
	public void doStuff() {
		System.out.println("Camera Clicking Pictures");
	}

	@Override
	public void stop() {
		System.out.println("Camera Stopped");
		
	}

}
