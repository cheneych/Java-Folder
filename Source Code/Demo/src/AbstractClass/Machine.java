package AbstractClass;

public abstract class Machine {

	private int id;

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}

	public abstract void start();

	public abstract void doStuff();

	public abstract void stop();
	
	public void run()
	{
		start();
		doStuff();
		stop();
	}

}
