class Solution {
    public int repeatedNTimes(int[] nums) {
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
           for(int j=i+1;j<nums.length;j++){
            if(nums[i] ==nums[j]) count++;
           }
           if(count>max){
              max =count;
              ans = nums[i];
           }
        }
        return ans;
    }
}