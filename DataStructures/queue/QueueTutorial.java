package queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * QUEUE:
 * =====================================================================================
 * Queue = 	FIFO data structure. First-In First-Out
 * 			A collection designed for holding elements prior to processing
 * 			Linear data structure
 * 
 * methods: enqueue = offer() to add objects in the queue in the TAIL
 * 			dequeue = poll() to remove objects from the queue from the HEAD
 * 			peek() to retrieves, but does not remove, the HEAD of this queue
 * 			Queue (I) extends collection (I), we can utilize all the collection (I) methods
 * 
 * uses:	1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
 * 			2. Printer Queue (Print jobs should be completed in order)
 * 			3. Used in LinkedLists, PriorityQueues, Breadth-first search
 * =====================================================================================
 */
public class QueueTutorial {

	public static void main(String[] args) {
		// Queue<String> queue = new Queue<String>(); // Cannot instantiate the type Queue<String> because Queue is an Interface
		
		// Using Queue we can instantiate only 2 available classes: LinkedList and PriorityQueue
		Queue<String> queue = new LinkedList<String>();
		System.out.println(queue);
		
		queue.offer("BMW");
		queue.offer("Mercedes");
		queue.offer("Audi");
		queue.offer("Ferari");
		queue.offer("Volkswagen");
		queue.offer("Ford");
		
		// These are three Methods of Collection (I) which we can use in Queue
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Audi"));
		
		// Methods of Queue (I)
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.poll()); // null (It will not throw any exception on empty Queue unlike Stack)
		
	}

}
