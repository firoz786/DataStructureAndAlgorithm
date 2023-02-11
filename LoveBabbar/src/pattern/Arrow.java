package pattern;

public class Arrow
{
	public static void main(String[] args)
	{
		int n = 7;
		for (int i = 1; i <= n; i++)
		{
			if (i == (n + 1) / 2)
			{
				for (int j = 0; j < n; j++)
					System.out.print("* ");
			} else
			{
				for (int j = 0; j < n / 2; j++)
					System.out.print("  ");
				if (i < (n + 1) / 2)
				{
					for (int j = 0; j < i; j++)
						System.out.print("* ");
				} else
				{
					for (int j = n-i+1; j > 0; j--)
						System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
