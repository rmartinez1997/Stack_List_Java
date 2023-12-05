package stack;

public interface StackInterface<T> {
	
		/*void push(String a);
		void pop();
		String top();	*/		//this is good for only string. try making generic.

	public void push(T a) throws StackOverflowException;
	public void pop() throws StackUnderflowException;
	public T top() throws StackUnderflowException;
	
	boolean isEmpty();
	boolean isFull();
		

}
