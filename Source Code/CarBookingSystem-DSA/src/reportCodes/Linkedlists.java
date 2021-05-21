package reportCodes;
import java.util.*;

public class Linkedlists {
	public static void main(String args[])
    {
		 
		        // Creating object of the
		        // class linked list
		        LinkedList<String> ll
		            = new LinkedList<String>();
		  
		        // Adding elements to the linked list
		        ll.add("I");
		        ll.add("Am");
		        ll.addLast("Abbas");
		        ll.addFirst("YUSS");
		        ll.add(2, "Broach");
		  
		        System.out.println(ll);
		  
		        ll.remove("Am");
		        ll.remove(3);
		        ll.removeFirst();
		        ll.removeLast();
		  
		        System.out.println(ll);
		    
    }

}
