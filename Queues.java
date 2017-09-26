package data_structures;

class Queue
{
	LinkList l;
	static int top;
	Queue()
	{
		l = new LinkList();
		top = -1;
	}
	void enqueue(int a)
	{
		l.insertatend(a);
		++top;
	}
	int size()
	{
		return top+1;
	}
	int dequeue()
	{
		if(top != -1)
		{
			top--;
			return l.deleteatBeg();
		}
		else
			return 0;
	}
	boolean isEmpty()
	{
		return top == -1? true : false;
	}
	int top()
	{
		return l.beg();
	}
}
public class queues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue s = new Queue();
		//System.out.println("Top = "+ s.top());
		s.enqueue(10);
		s.enqueue(20);
		System.out.println("Top df = "+ s.top());
		s.dequeue();
		System.out.println("Top df = "+ s.top());
		s.enqueue(30);
		s.dequeue();
		System.out.println("Top wdsd = "+ s.top());
		s.enqueue(5);
		System.out.println("Top 5 = "+ s.top());
		s.enqueue(2);
		System.out.println("Top df2 = "+ s.top());
		s.enqueue(1);
		System.out.println("Top = "+ s.top());
		s.enqueue(15);
		s.dequeue();
		System.out.println("Top df = "+ s.top());
		s.dequeue();
		System.out.println("Top = "+ s.top());
	}

}
