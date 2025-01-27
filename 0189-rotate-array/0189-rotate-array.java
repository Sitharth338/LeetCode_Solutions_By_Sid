 class Solution {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];
         for(int i=0;i<nums.length;i++){
        ans[k%nums.length]=nums[i];
        k++;
       }
for(int i=0;i<nums.length;i++){
         nums[i]=ans[i];
    }
}
}
    