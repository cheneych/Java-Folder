import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Machine
{

	@Override
	public String toString() {
		return "I am a Machine";
	}
	
	public void start()
	{
		System.out.println("Machine Started!");
	}
}

class Camera extends Machine
{
	@Override
	public String toString() {
		return "I am a Camera";
	}
	
	public void snap()
	{
		System.out.println("Snap!");
	}
	
	
}
public class App {

	public static void main(String args[])
	{
//		ArrayList list = new ArrayList();
//		
//		list.add("one");
//		list.add("two");
//		String fruit = (String)list.get(1);
//		System.out.println(fruit);
		
		ArrayList<Machine> abc = new ArrayList<Machine>();
		
		abc.add(new Machine());
		abc.add(new Machine());
//		System.out.println(abc.get(1));
		
		ArrayList<Camera> abc1 = new ArrayList<Camera>();
		abc1.add(new Camera());
		abc1.add(new Camera());
		
		//ShowList(abc);
		ShowList(abc1);
		
	}
	
	public static void ShowList(ArrayList<? extends Machine> abc)
	{
		for(Machine value:abc)
		{
			System.out.println(value);
			value.start();
			
		}
		
//		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		 
		
		
	}
}
