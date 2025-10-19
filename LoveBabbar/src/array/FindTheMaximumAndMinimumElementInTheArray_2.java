package LoveBabbar.src.array;

/*
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element is: 1
              Maximum element is: 9

Input: arr[] = {22, 14, 8, 17, 35, 3}
Output:  Minimum element is: 3
              Maximum element is: 35
*/

public class FindTheMaximumAndMinimumElementInTheArray_2
{
	public static void main(String[] args)
	{
		int arr[] = {3, 5, 4, 1, 9};
		System.out.println(maxmin(arr));
	}

	public static String maxmin(int[] arr)
	{
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		int i=0;
		while(i<arr.length-1)
		{
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];i++;
		}
		return "max: "+max+" min: "+min;
	}
}
