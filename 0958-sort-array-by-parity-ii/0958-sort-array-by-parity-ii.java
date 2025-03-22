class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int[] arr = new int[nums.length];
        int k=0;  //even 
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
            arr[k] = nums[i];
            k=k+2;
            }
        }
        int m =1;//odd
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0)
            {
                arr[m] = nums[i];
                m=m+2;
            }
        }
        return arr;
    }
}