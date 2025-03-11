class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
           sum+=nums[i];
        }
        

        int pair=0;
        int left =0;
        for(int i=0;i<nums.length-1;i++){
            left+=nums[i];

           int right = sum-left;
            if(Math.abs(left - right)%2==0){
                pair++;
            }

        }

        return pair;
    }
}