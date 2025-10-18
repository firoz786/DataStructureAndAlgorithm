// package Practice.Array.PrefixSum;

// public class PrefixSum {
//     public static void main(String args[]) {
//         int arr[] = { 1, 2, 3, 4, 5 };

//         // arr = prefixSum(arr);
//         // for (int cur : arr) {
//         // System.out.println(cur);
//         // }

//         arr = prefixDiff(arr);
//         for (int cur : arr) {
//             System.out.println(cur);
//         }
//     }

//     private static int[] prefixSum(int[] arr) {
//         if (arr.length == 1) {
//             return arr;
//         }
//         for (int i = 1; i < arr.length; i++) {
//             arr[i] = arr[i - 1] + arr[i];
//         }
//         return arr;
//     }

//     private static int[] prefixDiff(int[] arr) {
//         if (arr.length == 1) {
//             return arr;
//         }
//         for (int i = 1; i < arr.length; i++) {
//             arr[i] = arr[i] - arr[i-1];
//         }
//         return arr;
//     }
// }