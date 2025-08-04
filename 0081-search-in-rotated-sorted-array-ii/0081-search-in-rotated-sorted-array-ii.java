class Solution {
    public boolean search(int[] nums, int target) {
        // ArrayList<Integer> list = new ArrayList<>(Arrays.asList(nums));
        // if(list.contains(target)) return true;
        // return false;
        for(int n : nums){
            if(n==target) return true;
        }
        return false;
    }
}