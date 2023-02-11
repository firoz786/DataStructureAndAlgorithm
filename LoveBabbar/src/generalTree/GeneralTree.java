package generalTree;

import java.util.ArrayList;
import java.util.Stack;

public class GeneralTree
{
	static Node root=null;
	private static class Node
	{
		int data;
		ArrayList<Node> children = new ArrayList<>();
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1 };
		createTree(arr);
		print(root);
		System.err.println("size-->"+size(root));
	}

	private static int size(Node root2)
	{
		int size=0;
		for(Node child:root2.children)
			size = size(child)+size;
		
		size=size+1;
//		System.out.println("size-->"+size);
		
		return size;
	}

	private static void print(Node root2)
	{
		System.out.print(root2.data+"-->");
		for(Node child1:root2.children)
		{
			System.err.print(child1.data+",");
		}System.err.println(".");
		
		for(Node child:root2.children)
		{
			print(child);
		}
	}

	private static void createTree(int[] arr)
	{
		Stack<Node> st = new Stack<>();
		
		for (int i = 0; i < arr.length; i++)
		{
			Node newNode = new Node();
			newNode.data=arr[i];
			if (arr[i] == -1)
			{
				st.pop();
			}
			else
			{
				if(!st.isEmpty())
					st.peek().children.add(newNode);
				else
					root=newNode;
				st.push(newNode);
			}
		}
	}

}
