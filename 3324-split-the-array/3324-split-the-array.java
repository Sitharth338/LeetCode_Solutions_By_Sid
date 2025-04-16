class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] freq = new int[256];
        for(int val : nums){
            if(freq[val]++ >=2){
                return false;
            }
        }
        return true;
    }
}