package array;

public class KadaneAlgorithm
{
	public static void main(String[] args)
	{
		int[] arr = { -2, -3, 4, -1, 5, -2, 1, 5, -3 };
		kadaneAlgorithm(arr);
	}

	private static void kadaneAlgorithm(int[] arr)
	{
		int currSum = arr[0];
		int bestSum = arr[0];
		int start = 0;
		int end = 0;
		for (int i = 0; i < arr.length; i++)
		{
			if (currSum > 0)
			{
				currSum += arr[i];
			} else
			{
				currSum = arr[i];
				start = i;
			}
			if (currSum > bestSum)
			{
				bestSum = currSum;
				end = i;
			}
		}
		System.out.println(bestSum);
		System.out.println("start: " + start + "\nend:" + end);
	}

}
