class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int more = nums.length/3;
        Set<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int c=1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) c++;
            }
            if(c>more){
                list.add(nums[i]);
            }
        }
          List<Integer> ls = new ArrayList<>(list);
        return ls;
        
    }
}