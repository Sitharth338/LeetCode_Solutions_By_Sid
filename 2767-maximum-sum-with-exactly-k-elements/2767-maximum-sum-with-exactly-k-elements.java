class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums);
       int m = nums[nums.length-1];
       int ans  = k * m +( k *(k-1 ))/2;
       return ans;
    }
}