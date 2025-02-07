class Solution {
    public int thirdMax(int[] nums) {
      HashSet<Integer> s = new HashSet<>();
      for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
      }
      //if array less than 3 means print max element;
      if(s.size()<3) return Collections.max(s);
      s.remove(Collections.max(s)); // removing 1st max
      s.remove(Collections.max(s));  // removing 2nd max;
      return Collections.max(s);//printing 3rd max
    }
}