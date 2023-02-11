package level1;

import java.util.Arrays;
import java.util.Collections;

public class BarChart_98
{
	public static void main(String[] args)
	{
		Integer[] arr = { 3, 1, 0, 7, 5 };
		int maxima = Collections.max(Arrays.asList(arr));// max=7
		int max = maxima;
		for (int i = 0; i < max; i++)
		{
			for (int j = 0; j < arr.length; j++)
			{
				if (arr[j] < maxima)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			maxima--;
			System.out.println();
		}
	}
}
