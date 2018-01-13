import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Mach
{

		public void start()
	{
		System.out.println("Machine Started!");
	}
}

interface Plant
{
	public void grow();
}

public class App1 {

	public static void main(String args[])
	{
		Mach machine1 = new Mach()
				{
			@Override
			public void start()
			{
				System.out.println("Camera Started!");
			}
				};
		machine1.start();
		
		Plant plant = new Plant(){
			@Override
			public void grow()
			{
				System.out.println("Plant Growing....");
			}	
		};
		
		plant.grow();
		
		//String fileName = "C:/Users/gshkr/Desktop/example.txt";
//		String fileName = "example.txt2";
//		File textfile = new File(fileName);
//		
//		FileReader in = null;
//	
//		try {
//			//Scanner in = new Scanner(textfile);
//			
//		 in = new FileReader(textfile);
//			
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found");
//		}
//		
//		//System.out.println(in.nextInt());
//		//System.out.println(in.nextInt());
//		
//		in.nextLine();
//		int count = 2;
//		
////		while(in.hasNextLine())
////		{
////			String Line = in.nextLine();
////			System.out.println(count+":"+Line);
////			count++;
////			
////		}
		//in.close();
		
		try {
			openfile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		
	}
	
	public static void openfile() throws FileNotFoundException
	{
		File textfile = new File("fileName.txt");
		
		FileReader fr = new FileReader(textfile);
		
	}
}
