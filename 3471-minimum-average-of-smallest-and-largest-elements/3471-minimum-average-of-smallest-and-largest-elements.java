class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right=nums.length-1;
        double avg = nums[right];
        while(left<right){
          avg = Math.min(((nums[left]+nums[right])/2D),avg);
          left++;
          right--;
        }
        return avg;
    }
}