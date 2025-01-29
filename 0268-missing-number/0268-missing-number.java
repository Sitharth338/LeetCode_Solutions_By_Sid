class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
      
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