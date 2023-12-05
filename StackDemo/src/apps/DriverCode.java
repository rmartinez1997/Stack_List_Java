package apps;
import stack.StackImplementation;
import stack.StackInterface;
import stack.StackOverflowException;
import stack.StackUnderflowException;
public class DriverCode {

	public static void main(String[] args) throws StackOverflowException,StackUnderflowException
	{
		
		StackInterface<String> stack = new StackImplementation<String>(10);
		stack.push("hello");
		System.out.println(stack.top());

		//pop
		
		stack.pop();
		System.out.println(stack.top());
		
		//stack.push("A");
		//stack.push("B");
		//System.out.println(stack.top());
		
	
		
	}
	
}
