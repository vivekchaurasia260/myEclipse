package DefaultPackage;

import java.util.Stack;

public class MinStack {
	
	Stack<Integer> stack;
	int minimum;
	
	MinStack() {
		stack=new Stack<Integer>();
	}
	
	public void push(int x) {
		
		if(stack.isEmpty()) {
			minimum=x;
			stack.push(x);
			return;			
		}
		if(x < minimum) {
			stack.push(2*x - minimum);
			minimum=x;
			//System.out.println("Min Value "+minimum);
		}
		else
			stack.push(x);		
	}
	
	public void pop() {
		
		if(stack.isEmpty())
			return;
		int top=stack.pop();
		if(top<minimum) {
			System.out.println(minimum);
			minimum = 2*minimum -top;
		}
		else
			System.out.println(top);
		
	}
	
	public int peek() {
		
		if(stack.isEmpty())
			return 0;
		
		int peek = stack.peek();
		if(peek<minimum)
			return minimum;
		
		return peek;		
	}
	
	public int getMin() {
		
		if(stack.isEmpty())
			return 0;
		
		return minimum;		
	}

	public static void main(String[] args) {
		
		MinStack min = new MinStack();
		
		min.push(-2);
		min.push(0);
		min.push(-3);
		min.push(5);
		min.push(6);
		min.push(-8);
		min.push(7);
		min.push(8);		
		int topVal2 = min.peek();
		System.out.println("First Top value "+topVal2);	
//		int minVal = min.getMin();
//		System.out.println(minVal);
		min.pop();
		int topVal3 = min.peek();
		System.out.println("second Top value "+topVal3);	
		min.pop();
		min.pop();
		int topVal = min.peek();
		System.out.println(topVal);		
		int minVal2 = min.getMin();
		System.out.println(minVal2);
		

	}

}
