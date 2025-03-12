class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            i++;
        }
        return ans;
    }
}