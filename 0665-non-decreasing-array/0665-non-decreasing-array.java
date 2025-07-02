class Solution {
    public boolean checkPossibility(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]<nums[i-1]){ c++;
           if(c>=2){
            return false;
        }

         if(i - 2 >= 0 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1]; // Modify current
                } else {
                    nums[i - 1] = nums[i]; // Modify previous
                }
        }
    
        }
        
        return true;
    }
}