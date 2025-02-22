public class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;  // Sum of first n natural numbers
        int leftSum = 0;  // Sum of numbers from 1 to x
        
        for (int x = 1; x <= n; x++) {
            leftSum += x;  // Incrementally add to leftSum
            int rightSum = totalSum - leftSum + x;  // Compute rightSum

            if (leftSum == rightSum) {
                return x;  // Found the pivot integer
            }
        }
        
        return -1;  // No pivot integer found
    }
}