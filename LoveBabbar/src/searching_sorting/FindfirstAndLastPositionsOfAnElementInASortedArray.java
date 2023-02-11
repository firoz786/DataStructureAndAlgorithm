package searching_sorting;

import java.util.Arrays;

/*
 * Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
 */

public class FindfirstAndLastPositionsOfAnElementInASortedArray
{

	public static void main(String[] args)
	{
		int n = 9;
		int x = 67;
		int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		findfirstAndLastPositionsOfAnElementInASortedArray(arr, n, x);
	}

	private static void findfirstAndLastPositionsOfAnElementInASortedArray(int[] arr, int n, int x)
	{
		int i = 0;
		int res[] = new int[2];
		while (i < n)
		{
			if (arr[i] == x)
			{
				res[0] = i;
				while (arr[i] == x)
				{
					i++;
				}
				res[1] = i - 1;
			} else
				i++;
		}
		System.out.println(Arrays.toString(res));
	}

}
