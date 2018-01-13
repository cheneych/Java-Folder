package Queue;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queue123 {

	public static void main(String[] args) {
		
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		q1.add(30);
		q1.add(45);
		q1.add(60);
		
		System.out.println("Head Of the Queue is " +q1.element());
		for (Integer a: q1)
		{
			System.out.println("value is " +a);
		}
		
		System.out.println("Removed item is: "+q1.remove());
		System.out.println("Removed item is: "+q1.remove());
		System.out.println("Removed item is: "+q1.remove());
		try {
			System.out.println("Removed item is: "+q1.remove());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(2);

		System.out.println("Head Of the Queue2 is " +q.peek());
		q.offer(30);
		q.offer(45);
		q.offer(60);
		System.out.println("Head Of the Queue2 is " +q.peek());
		
		System.out.println("Removed item is: "+q.poll());
		System.out.println("Removed item is: "+q.poll());
		System.out.println("Removed item is: "+q.poll());
		System.out.println("Removed item is: "+q.poll());
		
		
	}

}
