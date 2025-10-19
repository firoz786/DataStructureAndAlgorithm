package LoveBabbar.src.array;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
*/

public class FindTheKthMinElementOfAnArray {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		sort(arr); // Arrays.sort(arr);
		findTheKthMinElementOfAnArray(arr, k);

		System.out.println("=========K’th smallest element in an unsorted array using set data structure ");
		int arr1[] = { 7, 10, 4, 3, 20, 15 };
		int k1 = 3;
		kthMinELementUsingSet(arr1, k1);

	}

	public static void kthMinELementUsingSet(int[] arr1, int k1) {
		Set<Integer> set = new TreeSet<>();
		for (int tp : arr1)
			set.add(tp);
		int i = 0;

		Iterator<Integer> itr = set.iterator();
		while (i < k1 - 1) {
			System.out.println(itr.next());
			i++;
		}

		System.out.println("The " + k1 + "th smallest element is " + itr.next());
	}

	private static void findTheKthMinElementOfAnArray(int[] arr, int k) {
		System.out.println("The " + k + "th smallest element is " + arr[k - 1]);
	}

	private static void sort(int[] arr) {
		int i = 0, j = 0;
		while (i < arr.length - 1) {
			j = i + 1;
			while (j < arr.length) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
				j++;
			}
			i++;

		}
	}

	private static void swap(int[] arr, int i, int j) {
		arr[i] = arr[i] + arr[j];
		arr[j] = arr[i] - arr[j];
		arr[i] = arr[i] - arr[j];
	}

}
