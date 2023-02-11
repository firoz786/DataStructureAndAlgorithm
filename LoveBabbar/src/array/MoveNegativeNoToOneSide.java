package array;

import java.util.Arrays;

/*
Input:  -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
 */
public class MoveNegativeNoToOneSide
{

	public static void main(String[] args)
	{
		int arr[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		moveOneSide(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void moveOneSide(int[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
			}
			else if(arr[i]>0 && i!=arr.length)
			{
				for(int j=i;j<arr.length;j++)
				{
					if(arr[j]<0)
					{
						arr[i]=arr[i]+arr[j];
						arr[j]=arr[i]-arr[j];
						arr[i]=arr[i]-arr[j];
					}
				}
			}
		}
	}

}
