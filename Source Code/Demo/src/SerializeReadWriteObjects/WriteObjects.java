package SerializeReadWriteObjects;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class WriteObjects {

	public static void main(String[] args) {
		
		System.out.println("Writing objects");
		
		Person person1 = new Person(7,"Happy");
//		Person person2 = new Person(9,"Me");
//		
//		Person[] people = {new Person(7,"Happy"), new Person(9,"Me"), new Person(10,"LaLa")};
//		ArrayList<Person> peoplelist = new ArrayList<Person>();
		
		
		try(FileOutputStream fo = new FileOutputStream("people.ser"))
		{
			ObjectOutputStream ob = new ObjectOutputStream(fo);
			
			ob.writeObject(person1);
			Person.setCount(88);
//			ob.writeObject(peoplelist);
//			ob.writeInt(peoplelist.size());
			
//			for (Person person: peoplelist)
//			{
//				ob.writeObject(person);
//			}
			
			ob.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		System.out.println(person1);
//		System.out.println(person2);

	}

}
