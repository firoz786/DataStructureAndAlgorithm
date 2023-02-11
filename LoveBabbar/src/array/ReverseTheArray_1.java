package array;

/*
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
*/
public class ReverseTheArray_1
{

	public static void main(String[] args)
	{
		int arr[] = {4, 5, 1, 2};
		reverseArray(arr);
		printArray(arr);
	}

	private static void printArray(int[] arr)
	{
		for(int temp:arr)
			System.out.print(temp+" ");
	}

	private static void reverseArray(int[] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;j--;
		}
		
	}

}
