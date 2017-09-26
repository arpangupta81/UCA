package data_structures;

class Node{
	int data;
	Node next;
	Node()
	{
		
	}
	Node(int a)
	{
		data = a;
		next = null;
	}
}

class LinkList{
	Node first, head;
	void insert(int a)
	{
		if(first == null)
		{
			Node h = new Node(a);
			first = h;
			head = h;
		}
		else
		{
			first.next = new Node(a); 
			first = first.next;
		}
	}
	void insertatBeg(int a)
	{
		if(head == null)
		{
			Node h = new Node(a);
			head = h;
		}
		else
		{
			Node h = new Node(a);
			h.next = head;
			head = h;
		}
	}
	
	void insertatend(int a)
	{
		Node h = new Node(a);
		Node temp = head;
		if(head == null)
		{
			head = h;
			return;
		}
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = h;
	}
	int deleteatBeg()
	{
		if(head == null)
		{
			return 0;
		}
		else
		{
			Node h = head;
			head = head.next;
			return h.data;
		}
	}
	int beg()
	{
		if(head != null)
			return head.data;
		else
			return 0;
	}
	void printList(){
		while(head != null)
		{
			System.out.print(head.data + "->");
			head = head.next;
		}
	}
}

  class linkedlist {
    public static void main(String[] args) {
        LinkList list = new LinkList();

        //list.insert(1);
        //list.insert(2);
        //list.insert(3);
        list.insertatBeg(7);
        //list.insert(4);
        //list.insert(5);
        list.insertatBeg(10);
        list.insertatBeg(9);
        list.insertatBeg(8);
        list.insertatBeg(7);
        list.insertatBeg(6);
        System.out.println("Hello " + list.deleteatBeg()+ " Hello ");
        list.printList();
    }
}
