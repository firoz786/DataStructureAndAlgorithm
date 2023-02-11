package com.dsa;

public class ArrangEvenAndOdd {

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
		int[] arr = { 2,4,5,6,8 };
		int n = arr.length;
		for (int i = 1; i <n; i++) {
			if (arr[i] % 2 == 1) {
				int k=i;
				while (arr[k-1] % 2 == 0) {
					swap(arr, k, k - 1);
					k--;
					if(k==0)
						break;
				}
			}
			print(arr);
			System.out.println();
		}
	}
}
