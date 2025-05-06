class Solution {
    public int[] buildArray(int[] nums) {

return func(nums);}
 static int[] func(int[] nums){
        int[]ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){

        int temp = nums[i];
         ans[i]=nums[temp];
        }
        return ans;

    }
}