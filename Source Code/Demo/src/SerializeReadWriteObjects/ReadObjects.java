package SerializeReadWriteObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObjects {

	public static void main(String[] args) {
		
		try(FileInputStream fi = new FileInputStream("person.bin"))
				{
					ObjectInputStream oi = new ObjectInputStream(fi);
					
					
					Person person1 = (Person)oi.readObject();
//					
//					@SuppressWarnings ("unchecked")
//					ArrayList<Person> peoplelist = (ArrayList<Person>)oi.readObject();
					
//					Person person1 = (Person)oi.readObject();
//					Person person2 = (Person)oi.readObject();
					
//					for (Person person: people)
//					{
//						System.out.println(person);
//					}
//					
//					for (Person person: peoplelist)
//					{
//						System.out.println(person);
//					}
//					
//					int num = oi.readInt();
//					
//					for (int i =0; i<num; i++){
//						Person person = (Person)oi.readObject();
//						System.out.println(person);
//					}
						
					
					System.out.println(person1);
//					System.out.println(person2);
					
					oi.close();
				
			 
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
