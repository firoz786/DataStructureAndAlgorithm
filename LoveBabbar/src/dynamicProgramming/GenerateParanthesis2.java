package dynamicProgramming;

public class GenerateParanthesis2
{
	public static void main(String[] args)
	{
		int n = 3;
		char[] str = new char[n * 2];
		printParanhesis(str, n);
	}

	static void printParanhesis(char[] str, int n)
	{
		if (n > 0)
			_printParanthesis(str, 0, n, 0, 0);
		return;
	}

	static void _printParanthesis(char[] str, int pos, int n, int open, int close)
	{

		if (close == n)
		{
			for (char c : str)
				System.out.print(c);
			System.out.println();
			return;
		} else
		{
			if (open > close)
			{
				str[pos] = '}';
				_printParanthesis(str, pos + 1, n, open, close + 1);
			}
			if (open < n)
			{
				str[pos] = '{';
				_printParanthesis(str, pos + 1, n, open + 1, close);
			}

		}
	}
}
