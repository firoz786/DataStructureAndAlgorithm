package Practice.Array.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -10, -4, 2, 4, 6, 7, 88, 99, 100, 400, 1000, };
        int target = -10;
        int index = iteratively(arr, target);
        System.out.println("mid=" + index);
    }

    private static int iteratively(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (arr[start] < arr[end]) {
            if (arr[mid] < target) {
                start = mid;
                mid = (start + end) / 2;
            } else if (arr[mid] > target) {
                end = mid;
                mid = (start + end) / 2;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
