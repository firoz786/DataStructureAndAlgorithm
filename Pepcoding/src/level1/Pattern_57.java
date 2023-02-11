package level1;

public class Pattern_57
{

	public static void main(String[] args)
	{
		int n = 8;
		int a = 0;
		int b = 1;
		int c;
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print(a + " ");
				c = a + b;
				a = b;
				b = c;
			}
			System.out.println();
		}
	}

}
