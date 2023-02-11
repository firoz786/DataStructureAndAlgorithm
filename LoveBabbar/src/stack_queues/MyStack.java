package stack_queues;

public class MyStack
{
	private int top;
	private int maxSize;
	private long[] stackArray;

	public MyStack(int s)
	{
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public static void main(String[] args)
	{
		MyStack myStack = new MyStack(4);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		while(!myStack.isEmpty())
			System.out.println(myStack.pop());
		System.out.println(myStack.isEmpty());
	
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		System.out.println(myStack.isFull());

	}

	private boolean isFull()
	{
		return top==maxSize-1;
	}

	private boolean isEmpty()
	{
		return top == -1;
	}

	private long pop()
	{
		return stackArray[top--];
	}

	private void push(int data)
	{
		if(top==maxSize-1)
			throw new RuntimeException("Stack is overflow");
		stackArray[++top] = data;
	}

}
