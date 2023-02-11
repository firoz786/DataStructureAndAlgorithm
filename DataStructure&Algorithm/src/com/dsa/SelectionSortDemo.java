package com.dsa;

public class SelectionSortDemo {
	public static void swap(int[] a, int i, int j) {
		a[i] = a[i] + a[j];
		a[j] = a[i] - a[j];
		a[i] = a[i] - a[j];

	}
	public static void print(int a[]) {
		for (int aa : a)
			System.out.print(aa + " ");

	}
	public static void main(String[] args) {
		int[] arr = { 5,1,0,7,3,2,4};
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				int k=i+1;
				while(arr[k]<arr[k-1])
				{	
					swap(arr,k,k-1);	
					k--;
					if(k==0)
						break;
				}
			
				print(arr);
				System.out.println();
			}
			
		}
	}
}
