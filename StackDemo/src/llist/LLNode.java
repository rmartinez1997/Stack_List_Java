package llist;

public class LLNode<T> {
	protected T data;
	protected LLNode<T> next;
	
	public LLNode(T data) {
		this.data = data;
		this.next = null;
	}
	public void setNext(LLNode<T> node)
	{
		this.next = node;
	}
	
	public LLNode<T> getNext()
	{
		return this.next;
	}
	public T getData()
	{
		return this.data;
	}
	public String toString()
	{
		return this.data.toString();
	}
}
