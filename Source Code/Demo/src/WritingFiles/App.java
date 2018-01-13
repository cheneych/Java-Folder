package WritingFiles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		File file = new File("test.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one");
			br.newLine();
			br.write("This is line two");
			br.newLine();
			br.write("This is Last line");
		}  catch (IOException e) {
			System.out.println("File has nothing to read 	" + file.toString());
		}

	}

}
