class Solution {
    public int[] transformArray(int[] ans) {
        int[] nums = new int[ans.length];
        for(int i=0;i<nums.length;i++){
            if(ans[i]%2==0){
               nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
      Arrays.sort(nums);
        return nums;
    }
}