package Practice.Array.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { -10, -4, 2, 4, 6, 7, 88, 99, 100, 400, 1000 };
        int target = 99;

        int start = 0, end = arr.length - 1;
        
        // Recursive search
        int indexRecursive = recursively(arr, start, end, target);
        System.out.println("Recursive search found at index: " + indexRecursive);

        // Iterative search
        int indexIterative = iteratively(arr, target);
        System.out.println("Iterative search found at index: " + indexIterative);
    }

    // Recursive binary search
    private static int recursively(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1; // target not found
        }
        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return recursively(arr, mid + 1, end, target);
        } else {
            return recursively(arr, start, mid - 1, target);
        }
    }

    // Iterative binary search
    private static int iteratively(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid; // found target
            } else if (arr[mid] < target) {
                start = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }
        return -1; // target not found
    }
}
