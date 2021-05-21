package reportCodes;
import java.util.*;

public class Queue {
	// Java program to demonstrate a Queue
		public static void main(String[] args) {

			PriorityQueue<String> queue=new PriorityQueue<String>();
			queue.add("Mini");
			queue.add("Micro");
			queue.add("Sedean");
			queue.add("SUV");
			queue.add("Taxi");

			System.out.println("head:"+queue.element());
			System.out.println("head:"+queue.peek());

			System.out.println("iterating the queue:");
			Iterator itr=queue.iterator();
			while(itr.hasNext()){
			System.out.println(itr.next());
			}

			queue.remove();
			queue.poll();

			System.out.println("after removing two elements:");
			Iterator<String> itr2=queue.iterator();
			while(itr2.hasNext()){
			System.out.println(itr2.next());
			}

			
		}
	}