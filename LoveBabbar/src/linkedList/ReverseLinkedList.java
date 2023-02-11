package linkedList;

/*
Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL
 */
public class ReverseLinkedList
{
	static Node head = null;
	static Node tail = null;
	static int size = 0;

	public static class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
		}
	}

	private static void pustAtLast(Node node)
	{
		if (size == 0)
		{
			head = tail = node;
			node.next = null;
		} else
		{
			tail.next = node;
			tail = node;
		}
		size++;
	}

	public static void print()
	{
		if (head == null)
		{
			System.out.println("NULL");
		} else
		{
			Node temp = head;
			while (temp.next != null)
			{
				System.err.print(temp.data + "-->");
				temp = temp.next;
			}
			System.err.print(temp.data + "-->NULL");
		}
	}

	public static void main(String[] args)
	{
		Node node = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		pustAtLast(node);
		pustAtLast(node1);
		pustAtLast(node2);
		pustAtLast(node3);
		print();
		System.out.println("\n<============Reverse Using Iteratively==============>");
//		reverseLinkedList(tail);
//		print();
		
		//using recursion
		System.out.println("\n<============Reverse Using Recursion==============>");
		reverseListRecursive(head);
		head.next=null;
		Node temp=head;
		head=tail;
		tail=temp;
		
		print();
		
	}

	private static void reverseListRecursive(Node node)
	{
		if(node==null)
			return;
		
		reverseListRecursive(node.next);
		if(node==tail)
		{
			//do nothing for the last node
		}
		else {
			node.next.next=node;
		}
	}

	private static void reverseLinkedList(Node tail2)
	{
		if (size == 0)
		{
			System.out.println("NULL");
		} else
		{
			Node curr = head;
			Node prev=null;
			Node next=null;
			
			while(curr!=null)
			{
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}head=prev;

		}
	}

}
