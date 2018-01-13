package AbstractClass;

public class App {

	public static void main(String args[])
	{
		Camera cam1 = new Camera();
		
		cam1.setID(4);
		
		Car car1 = new Car();
		
		car1.setID(5);
		car1.run();
		
//		cam1.start();
//		cam1.doStuff();
//		cam1.stop();
	}
}
