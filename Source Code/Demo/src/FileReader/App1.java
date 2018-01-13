package FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App1 {
	
	public static void main(String args[])
	{
		
		File file = new File("test.txtd");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found " +file.toString());
		} catch (IOException e) {
			System.out.println("File has nothing to read 	"+file.toString());
		}
	}
}
