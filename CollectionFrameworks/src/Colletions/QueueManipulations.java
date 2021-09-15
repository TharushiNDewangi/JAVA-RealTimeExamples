package Colletions;

import java.util.PriorityQueue;
import java.util.Stack;

public class QueueManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		showPriorityQueue();
		showStack();
	}
	
	/**
	 * Display Elements in Priority Queue
	 */
	public static void showPriorityQueue(){
		
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		priorityQueue.add(11);
		priorityQueue.add(22);
		priorityQueue.add(22);
		priorityQueue.add(44);
		priorityQueue.add(33);
		priorityQueue.add(55);
		priorityQueue.add(66);
		priorityQueue.add(77);
		priorityQueue.add(88);
		
		System.out.println("=======Before=======================");
		System.out.println(priorityQueue);

		//Show first element
		System.out.println("Queue Peek = " + priorityQueue.peek());
		//Poll delete the first element
		System.out.println("Queue Poll = " + priorityQueue.poll());
		//Poll delete the second element
		System.out.println("Queue Poll = " + priorityQueue.poll());
		// Insert new element 99
		priorityQueue.add(99);
		
		System.out.println("=======After=======================");
		System.out.println(priorityQueue);
	}
	
	/**
	 * Add and remove from stack
	 */
	public static void showStack(){
		
		Stack<String> stack = new Stack<String>();
		stack.push("aaaaaaa");
		stack.push("bbbbbbb");
		stack.push("ccccccc");
		stack.push("ddddddd");
		stack.push("eeeeeee");		
		stack.add("ffffffff");
		
		System.out.println(stack);
		//Remove last Item
		System.out.println("Stack pop = " + stack.pop() + "\n");
		
		System.out.println(stack);
		//Add elements
		System.out.println("Stack add = " + stack.add("1111111") + "\n");
		System.out.println("Stack add = " + stack.add("2222222") + "\n");
		
		System.out.println(stack);
	}

}
