package array;

public class UnionElementsCount
{
	public static void main(String[] args)
	{
		int[] am = { 1, 2, 3, 4, 5 };
		int[] bn = { 1, 2, 3, 8 };

		doUnion(am,bn.length, bn, am.length);
	}

	public static void doUnion(int a[], int n, int b[], int m)
	{
		int max = Math.max(n, m);
		int min = Math.min(m, n);
		int count=max;
		for(int i=0,j=0;j<min;i++,j++)
		{
			if(a[i]!=b[j])
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
