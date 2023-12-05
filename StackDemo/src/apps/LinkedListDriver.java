package apps;

import llist.LLNode;
import stack.LinkedListImplementation;
import stack.StackInterface;
import stack.StackOverflowException;
import stack.StackUnderflowException;

public class LinkedListDriver {

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		LLNode<String> node1 = new LLNode<String>("A");		//we want to get a chain of nodes. When printing them out, you want to tell the system where the list starts and then move the start
		LLNode<String> node2 = new LLNode<String>("B");		//to here and then to c and then d.
		LLNode<String> node3 = new LLNode<String>("C");		//to here
		LLNode<String> node4 = new LLNode<String>("D");		//to here
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		LLNode<String> temp = node1;
		while(temp != null)									// this while loop will print out all nodes that node1 is connected to.
		{
			System.out.println(temp);
			temp = temp.getNext();
		}
															// you could look up examples of linked list if you google search linkedlist.java 
		
		//stack linkedlistimplementation
		
		StackInterface<String> llstack = new LinkedListImplementation<>();
		llstack.push("A");
		llstack.push("B");
		llstack.push("C");
		llstack.push("D");
		System.out.println(llstack.top());
		
	}

}
