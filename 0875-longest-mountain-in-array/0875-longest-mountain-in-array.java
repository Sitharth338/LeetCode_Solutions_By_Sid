
class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        if (n < 3)
            return 0; // Base case.
        int i = 1; // Starting from second element, since first cannot be peak.
        int longest = 0; // To store peak length.

        while (i < n - 1) {
            boolean isPeak = ((arr[i] > arr[i - 1]) && (arr[i] > arr[i + 1])); // Checking for peak condition.
            if (isPeak) {
                // Two pointers to traverse both sides of the peak.
                int left = i;
                int right = i;

                // Search left boundary
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                // Search right boundary
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int currLen = right - left + 1;
                longest = Math.max(longest, currLen);

                // Skip to end of the right mountain.
                i = right;
            } else {
                i++; // Search peak in next element.
            }
        }

        return longest;
    }
}