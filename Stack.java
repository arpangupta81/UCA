package data_structures;

class Stack
{
	LinkList l;
	int top;
	Stack()
	{
		l = new LinkList();
		top = -1;
	}
	void push(int a)
	{
		
		l.insertatBeg(a);
		++top;
	}
	boolean isEmpty()
	{
		if(top == -1)
			return true;
		else 
			return false;
	}
	int pop()
	{
		if(top != -1)
		{
			top--;
			return l.deleteatBeg();
		}
		else
			return 0;
	}
	int top()
	{
		return l.beg();
	}
}
public class stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		System.out.println("Top = "+ s.top());
		s.push(10);
		s.push(20);
		s.pop();
		s.push(30);
		s.pop();
		s.push(5);
		System.out.println("Top = "+ s.top());
		s.push(2);
		s.push(1);
		System.out.println("Top = "+ s.top());
		s.push(15);
		System.out.println("Top = "+ s.top());
		s.pop();
		System.out.println("Top = "+ s.top());
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("Empty = "+ s.isEmpty());
	}

}
