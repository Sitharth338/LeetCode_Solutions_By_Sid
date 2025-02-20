class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //storing unique values..
        HashSet<Integer> set  = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        // create empty list 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}