package level1;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization
{

	public static void main(String[] args)
	{
		int n = 120 ;
		int dividend = 0;
		int i = 2;
		List<Integer> list = new ArrayList<>();
		while (dividend != 1)
		{
			if (isPrime(i) && n%i==0)
			{
				dividend = n / i;
				n = n / i;
				list.add(i);
			} else
				i++;
		}
		System.out.println(list);
	}

	private static boolean isPrime(int n)
	{
		int count = 0;
		for (int i = 1; i * i <= n; i++)
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
