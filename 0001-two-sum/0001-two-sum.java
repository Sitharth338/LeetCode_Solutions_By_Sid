class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int [2];
        for(int i=0;i<nums.length;i++){
            arr[0]=i;
            for(int j=i+1;j<nums.length;j++){
                if(target==nums[i]+nums[j]){
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }
}