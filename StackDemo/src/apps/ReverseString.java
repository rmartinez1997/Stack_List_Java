package apps;
import stack.ArraryListImplementation;
import stack.StackInterface;
import stack.StackOverflowException;
import stack.StackUnderflowException;
public class ReverseString {

	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		String word = "hello";
		StackInterface<Character> stack = new ArraryListImplementation<Character>();
		for(int i = 0; i <word.length(); i++)
		{
			stack.push(Character.valueOf(word.charAt(i)));;		//this is new. dont forget. this is not new Integer.
		}
		while(!stack.isEmpty()){
			Character ch = stack.top();
			System.out.print(ch);
			stack.pop();
		}
		stack.push('f'); //this is ignored because it is after 'y'
		stack.push('y');
		Character ch = stack.top();
		System.out.println();
		System.out.print(ch);
		System.out.println();
		stack.pop();
		
		stack.push(null);
		stack.push(null);
		System.out.println(stack);
	}

}
