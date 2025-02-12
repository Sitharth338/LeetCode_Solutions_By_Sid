class Solution {
    public int sumOfUnique(int[] nums) {
        Arrays.sort(nums);
        int sum =0;
       // for(int i=0;i<nums.length-1;i++){
        //    if(nums[i]!=nums[i+1]){
         //       sum = sum + nums[i];
         //   }
       // }
       // return sum;

        for (int i = 0; i < nums.length; i++) {
            // Check if nums[i] is unique
            if ((i == 0 || nums[i] != nums[i - 1]) && (i == nums.length - 1 || nums[i] != nums[i + 1])) {
                sum += nums[i];
            }
        }

        return sum;
    

    }
}