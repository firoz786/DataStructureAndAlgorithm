package array;

import java.util.Arrays;

public class SortAnArrayOf0s1s2s
{

	public static void main(String[] args)
	{
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		sortAnArrayOf0s1s2s(arr);// sorting method

		int[] arr1 = { 0, 1, 2, 0, 1, 2 };
		rangeMethod(arr1);//

	}

	private static void rangeMethod(int[] arr1)
	{
		int low = 0;
		int mid = 0;
		int high = arr1.length-1;
		while(mid<=high)
		{
			if(arr1[mid]==0)
			{
				swap(arr1,low,mid);
				low++;
				mid++;
			}
			else if(arr1[mid]==1)
			{
				mid++;
			}
			else
			{
				swap(arr1,mid,high);
				high--;
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

	private static void swap(int[] arr1, int low, int mid)
	{
		arr1[low]=arr1[low]+arr1[mid];
		arr1[mid]=arr1[low]-arr1[mid];
		arr1[low]=arr1[low]-arr1[mid];
	}

	// 1st Approach : Sorting way =O(n2)
	private static void sortAnArrayOf0s1s2s(int[] arr)
	{
		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] > arr[j])
				{
					arr[i] = arr[i] + arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i] = arr[i] - arr[j];
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

// 2nd approach : counting approach . count no .of 0s 1s and 2s and place according 