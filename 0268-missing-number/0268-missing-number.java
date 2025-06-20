class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
         /* int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
          sum1 = sum1 +nums[i];
        }

        for(int j=1;j<nums.length+1;j++){
            sum2 = sum2 + j;
        }
        return sum2-sum1;   */
      
        int i;
        int j=0;
        for( i=0;i<nums.length;i++){
            if(nums[i] != j){
                return i;
            }
            j++;
        }
        return i;
    }
}