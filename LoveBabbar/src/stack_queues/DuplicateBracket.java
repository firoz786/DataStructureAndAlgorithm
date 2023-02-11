package stack_queues;

import java.util.Stack;

public class DuplicateBracket
{
	// (a+b)+((a+b)) = true (unnecessary brackets)
	// ((a+b)+(a+b)) = false
	public static void main(String[] args)
	{
		String str = "((a+b)+(c+d))";
//		String str = "(a+b)+((c+d))";
		System.out.println(validDuplicateBrackets(str)+" Unnecessary brackets present");
	}

	private static boolean validDuplicateBrackets(String str)
	{
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == ')')
			{
				if (st.peek() == '(')
				{
					return true;
				} else
				{
					while (st.peek() != '(')
					{
						st.pop();
					}
				}
			} else
				st.push(str.charAt(i));
		}
		return false;
	}
}
