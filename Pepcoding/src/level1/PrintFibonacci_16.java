package level1;

import java.util.Scanner;

public class PrintFibonacci_16
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		int N = new Scanner(System.in).nextInt();
		printFib(N);

	}

	private static void printFib(int n)
	{
		int sum = 0;
		int first = 0;
		int second = 1;

		while (sum < n)
		{
			if (sum == 0)
				System.out.print("0 ");
			sum = first + second;
			if (sum > n)
				break;
			System.out.print(sum + " ");
			first = second;
			second = sum;
		}
	}

}
