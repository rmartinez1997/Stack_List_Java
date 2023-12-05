package stack;
import java.util.ArrayList;
import java.util.List;
public class ArraryListImplementation<T> implements StackInterface<T> {

	protected List<T> elements;
	
	
	public ArraryListImplementation() {
		
		this.elements = new ArrayList<T>();
	}

	@Override
	public void push(T a) throws StackOverflowException {
		this.elements.add(a);			//for Arraylist, the top would be the final element entered.
		
	}
	@Override
	public void pop() throws StackUnderflowException {
		if(!isEmpty())
		{
			this.elements.remove(this.elements.size()-1);
		}
		else
		{
			throw new StackUnderflowException("array list stack is empty");
		}
		
	}
	@Override
	public T top() throws StackUnderflowException {
		if(!isEmpty())
		{
			return this.elements.get(this.elements.size()-1);  //dont forget the -1 because your array would be out of range. the third element is array[2]. thats 1 below 3
		}
		else
			
		{
			throw new StackUnderflowException("array list stack is empty");   //WHEN YOU ADD EXCPETION IT WORKS
		}
		
	}
	@Override
	public boolean isEmpty() {
		return this.elements.size() == 0;
	}
	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
