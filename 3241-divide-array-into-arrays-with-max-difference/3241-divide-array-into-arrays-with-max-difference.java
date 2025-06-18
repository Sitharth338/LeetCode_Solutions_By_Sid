class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] res = new int[0][0];
        for(int i=0;i+2<nums.length;++i){
            if(i%3==0){
                if(nums[i+2]-nums[i]<=k){
                    int[] trip = {nums[i],nums[i+1],nums[i+2]};
                    res = Arrays.copyOf(res,res.length+1);
                    res[res.length-1] = trip;
                }else{
                    return new int [0][0];
                }
            }
        }
        return res;
    }
}