package com.firoz.Array;

public class Reverse_The_Array {

	static void swapArray(int arr[], int n) {
		for (int i = 0; i < (n / 2); i++) {

			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;

		}
	}

	static void printArray(int arr[], int n) {
		System.out.print("[");
		for (int i = 0; i < n; i++)
			System.out.print(" " + arr[i]);
		System.out.print("]");

	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		// int arr[] = { 4, 5, 1, 2 ,9};
		swapArray(arr, arr.length);
		printArray(arr, arr.length);

	}

}

//INPUT
/*
 * Input : arr[] = {1, 2, 3} Output : arr[] = {3, 2, 1}
 * 
 * Input : arr[] = {4, 5, 1, 2} Output : arr[] = {2, 1, 5, 4}
 */