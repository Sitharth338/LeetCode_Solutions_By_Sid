class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int count = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                count = Math.min(count, right - left + 1);
                sum = sum - nums[left];   //one element aa remove panrom....sliding window;
                left++;
            }
        }
        return count == Integer.MAX_VALUE ? 0 : count;

    }
}