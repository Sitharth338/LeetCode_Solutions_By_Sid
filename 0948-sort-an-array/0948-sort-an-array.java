class Solution {
    public int[] sortArray(int[] nums) {
        // Initialize max and min values to the first element of the array
        int max = nums[0];
        int min = nums[0];
        
        // Find the maximum and minimum values in the array
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        // Calculate the range of the numbers in the array
        int n = max - min;
        
        // Create a counting array to count the occurrences of each number
        int[] count = new int[n + 1];
        
        // Populate the counting array
        for (int num : nums) {
            count[num - min]++;
        }
        
        // Reconstruct the sorted array using the counting array
        int idx = 0;
        for (int i = 0; i <= n; i++) {
            while (count[i] > 0) {
                nums[idx] = i + min;
                idx++;
                count[i]--;
            }
        }
        
        // Return the sorted array
        return nums;
    }
}