class Solution {
    public int maximizeSum(int[] nums, int k) {
       Arrays.sort(nums);
       int max = nums[nums.length-1];
       int sum=0;
       int ans=0;
       int j=0;
      // int ans  = k * m +( k *(k-1 ))/2;
       for(int i=0;i<k;i++){
         sum = max+j;
         j++;
         ans+=sum;
         sum=0;
       }
       
      
       return ans;
    }
}