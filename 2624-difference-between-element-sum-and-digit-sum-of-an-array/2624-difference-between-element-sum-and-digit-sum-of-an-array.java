class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
        }
       
        
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            String a = String.valueOf(nums[i]);
            for(int j=0;j<a.length();j++){
                sum2+=a.charAt(j)-'0';
            }
        }

        return sum1-sum2;
    }
}