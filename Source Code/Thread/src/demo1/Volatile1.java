package demo1;

import java.util.Scanner;

class Processor extends Thread
{
	
	private volatile boolean running = true;
	
	public void run()
	{
		while(running)
		{
			System.out.println("Hello");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}

	}

	public void shutdown(){
		
		running = false;
	}
}

public class Volatile1 {

	public static void main(String[] args) {
		
		Processor p1 = new Processor();
		p1.start();
		
		System.out.println("Click Enter to stop process");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		p1.shutdown();
		

	}

}
