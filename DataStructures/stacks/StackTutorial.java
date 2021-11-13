package stacks;

import java.util.Stack;

/**
 * STACK:
 * =====================================================================================
 * stack:	LIFO data structure. Last-In First-Out
 * 			stores objects into a sort of "vertical tower"
 * 
 * methods: push() to add objects to the top
 * 			pop() to remove objects from the top, also returns that removed object as value
 * 			peek() to look at the object at the top of this stack without removing it
 * 			empty() to check if this stack is empty or not
 * 			Stack (C) extends vector (C), we can utilize all the vector (C) methods
 * 
 * uses:	1. undo/redo features in text editors
 * 			2. moving back/forward through browser history
 * 			3. backtracking algorithms (maze, file directories)
 * 			4. calling functions (call stack)
 * =====================================================================================
 */

public class StackTutorial {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();

		System.out.println("Is stack empty? " + stack.empty());
		System.out.println("Print stack items: " + stack);
		// System.out.println("Top object in the stack: " + stack.peek()); // throws EmptyStackException
		

		stack.push("Tokyo");
		stack.push("London");
		stack.push("Sydney");
		stack.push("Paris");
		stack.push("Mumbai");

		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		System.out.println(stack);
		// stack.pop(); java.util.Stack.pop after Stack is empty
	}

}
