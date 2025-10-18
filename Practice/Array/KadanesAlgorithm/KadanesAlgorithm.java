package Practice.Array.KadanesAlgorithm;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1 };
        
        int maxSoFar = arr[0];
        int currSum = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // Step 1: Decide whether to extend or start new subarray
            currSum = Math.max(arr[i], currSum + arr[i]);

            // Step 2: Update maxSoFar if needed
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        System.out.println("Max subarray sum = " + maxSoFar);
    }
}
