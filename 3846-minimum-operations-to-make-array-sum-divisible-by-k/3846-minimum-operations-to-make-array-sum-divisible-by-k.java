class Solution {
    public int minOperations(int[] nums, int k) {
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum<k){
            return sum;
        }
        int count=0;
        while(true){
            if(sum%k==0) return count;
            count++;
            sum = sum - 1;
        }
       

    }
}