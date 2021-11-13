package queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Priority Queue:
 * ===========================================
 * A FIFO data structure
 * serves elements with the highest priorities first before elements with lower priority
 * 
 * Default Order:
 * --------------
 * Integer, Double - Smallest to Largest (Ascending)
 * String - Alphabetically (Ascending)
 */

public class PriorityQueueTutorial {

	public static void main(String[] args) {
		System.out.println("***** Double Priority Queue in default/ascending order *****");
		pqDoubleDefaultOrder();
		System.out.println("***** Double Priority Queue in descending order *****");
		pqDoubleDescendingOrder();
		System.out.println("***** String Priority Queue in default/ascending order *****");
		pqStringDefaultOrder();
		System.out.println("***** String Priority Queue in descending order *****");
		pqStringDescendingOrder();
		
	}
	
	static void pqDoubleDefaultOrder() {
		Queue<Double> gpa = new PriorityQueue<>();
		gpa.offer(3.5);
		gpa.offer(2.7);
		gpa.offer(1.2);
		gpa.offer(6.9);
		gpa.offer(4.5);
		
		while(! gpa.isEmpty()) {
			System.out.println(gpa.poll());
		}
	}
	
	static void pqDoubleDescendingOrder() {
		Queue<Double> gpa = new PriorityQueue<>(Collections.reverseOrder());
		gpa.offer(3.5);
		gpa.offer(2.7);
		gpa.offer(1.2);
		gpa.offer(6.9);
		gpa.offer(4.5);
		
		while(! gpa.isEmpty()) {
			System.out.println(gpa.poll());
		}
	}
	
	static void pqStringDefaultOrder() {
		Queue<String> gpa = new PriorityQueue<>();
		gpa.offer("C");
		gpa.offer("E");
		gpa.offer("A");
		gpa.offer("D");
		gpa.offer("B");
		
		while(! gpa.isEmpty()) {
			System.out.println(gpa.poll());
		}
	}
	
	static void pqStringDescendingOrder() {
		Queue<String> gpa = new PriorityQueue<>(Collections.reverseOrder());
		gpa.offer("C");
		gpa.offer("E");
		gpa.offer("A");
		gpa.offer("D");
		gpa.offer("B");
		
		while(! gpa.isEmpty()) {
			System.out.println(gpa.poll());
		}
	}

}
