package level1;

import java.util.Arrays;

public class SumArrays
{

	public static void main(String[] args)
	{
		int[] arr2 = { 3, 1, 0, 7, 5, 1 };
		int[] arr1 = {       3, 1, 2, 3 };
		int l1 = arr1.length;
		int l2 = arr2.length;
		int maxlen = Math.max(l1, l2);
		int[] sum = new int[maxlen];
		int carry=0;
		while (maxlen != 0)
		{
			if ((l1 != 0 && l2 != 0)) {
				sum[maxlen-- - 1] = arr1[l1-- - 1] + arr2[l2-- - 1]+carry;
				if(sum[maxlen-1]>9)
				{
					
					sum[maxlen-1]=0;
					carry=1;
				}
			}
			else
			{
				int temp = Math.abs(l2 - l1)-1;
				if (l1 == 0 )
				{
					while (temp != 0)
						sum[temp - 1] = arr2[temp-- - 1];
				} 
				else
				{
					while (temp != 0)
						sum[temp - 1] = arr1[temp-- - 1];
				}maxlen--;

			}
		}
		System.out.println(Arrays.toString(sum));
	}

}
