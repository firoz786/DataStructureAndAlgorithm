package level1;

import java.util.Scanner;

public class IsPrimeNumber_12
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(isPrime(n));
		scanner.close();
	}
	private static boolean isPrime(int n)
	{
		int count = 0;
		for (int i = 1; i*i <= n; i++)
		{
			if (n % i == 0)
			{
				count++;
				if (count == 2)
					return false;
			}
		}
		return true;
	}
}
