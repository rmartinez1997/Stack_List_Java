package stack;

public class StackImplementation<T> implements StackInterface<T>{
	
	protected T[] elements;
	protected int size;
	protected int topIndex;
	
	public StackImplementation(int size)
	{
		elements = (T[]) new Object[size];  //you don't have to use T, you could use any letter
		this.size = size;
		this.topIndex = -1;
	}
	
	@Override
	public void push(T el) throws StackOverflowException //el is just a variable. could be anything
	{
		//check if full, if yes, don't push, otherwise push. You could implement this for code. We don't in this code
		// ^to check if full, use the code commented with **
		//add element a of type T on top my stack
		if(!isFull())
		{
			elements[++topIndex] = el; //**
		}
		else
		{
			throw new StackOverflowException("The stack is full"); //**
		}
	}
	
	@Override
	public void pop() throws StackUnderflowException 
	{
		// TODO Auto-generated method stub
		if(!isEmpty())
		{
			elements[topIndex] = null;
		}
		else
			{
			throw new StackUnderflowException("The stack is empty");
			}
	}

	public T top() throws StackUnderflowException
	{
		if(!isEmpty())
		{
		return elements[topIndex];
		}
		else
		{
			throw new StackUnderflowException("Stack is empty");
		}
	}


	public boolean isFull()
	{
		return topIndex == (this.size -1);
	}
	
	public boolean isEmpty()
	{
		return(topIndex ==-1);		//same as if(topIndex ==-1){return true} else {return false}
	}

	

}
