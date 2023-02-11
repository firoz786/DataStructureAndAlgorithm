package stack_queues;

import java.util.Stack;

public class InfixEvaluation
{
	public static void main(String[] args)
	{
		String exp = "2+(5-3*6/2)";
		Stack<Integer> oprnds = new Stack<>();
		Stack<Character> oprtrs = new Stack<>();
		for (int i = 0; i < exp.length(); i++)
		{
			char ch = exp.charAt(i);
			if (ch == '(')
			{
				oprtrs.push(ch);
			} else if (Character.isDigit(ch))
			{
				oprnds.push(ch - '0');
			} else if (ch == ')')
			{
				while (oprtrs.peek() != '(')
				{
					char optor = oprtrs.pop();
					int v1 = oprnds.pop();
					int v2 = oprnds.pop();

					int oprValue = operation(v1, v2, optor);
					oprnds.push(oprValue);
				}
				oprtrs.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')
			{
			}
		}
	}

	private static int operation(int v1, int v2, char sign)
	{
		int value = Integer.MAX_VALUE;
		if (sign == '+')
		{
			value = v1 + v2;
		}
		if (sign == '-')
		{
			value = v1 - v2;
		}
		if (sign == '*')
		{
			value = v1 * v2;
		}
		if (sign == '/')
		{
			value = v1 / v2;
		}
		return value;
	}

	public static int precedence(char ch)
	{
		if (ch == '+')
		{
			return 1;
		} else if (ch == '-')
		{
			return 1;
		} else if (ch == '*')
		{
			return 2;
		} else
		{
			return 2;
		}
	}
}
