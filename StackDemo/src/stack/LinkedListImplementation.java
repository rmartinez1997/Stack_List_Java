package stack;
import llist.LLNode;

public class LinkedListImplementation<T> implements StackInterface<T> {

	protected LLNode<T> top;
	
	public LinkedListImplementation()
	{
		this.top = null;    //this is put so you wont get confused if you just use top.
	}
	public LinkedListImplementation(LLNode<T>node)
	{
		this.top = node;
	}

	@Override
	public void push(T a) throws StackOverflowException {
		LLNode<T> newNode = new LLNode<T>(a);
		newNode.setNext(top);
		top = newNode;
	}

	@Override
	public void pop() throws StackUnderflowException {
		if(!isEmpty()) //you could always just use isEmpty() and switch if else statements
		{
			top = top.getNext();
		}
		else
		{
			throw new StackUnderflowException("blah");
		}
		
	}

	@Override
	public T top() throws StackUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
