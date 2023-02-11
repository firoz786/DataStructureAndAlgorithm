package level1;

public class PrintZ_4
{

	public static void main(String[] args)
	{
		int n = 5;
		for (int i = 0; i < n; i++)
			System.out.print("*");
		System.out.println();
		print(n);
		for (int i = 0; i < n; i++)
			System.out.print("*");
	}

	private static void print(int n)
	{
		for (int i = 0; i < n - 2; i++)
		{
			for (int k = n - 2 - i; k > 0; k--)
				System.out.print(" ");
			System.out.print("*");
			System.out.println();
		}

	}

}
