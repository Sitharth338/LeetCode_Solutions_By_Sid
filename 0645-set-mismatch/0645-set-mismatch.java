class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat=0;
        for(int i=0;i<nums.length;i++){
            int c=1;
            int num = nums[i];
            for(int j=0;j<nums.length;j++){
                if(i!=j && num == nums[j]) c++;
            }
            if(c==2){
                 repeat = nums[i];
            }
        }
       
   HashSet<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums.length;i++){
           set1.add(nums[i]);
        }
        int miss=0;
   HashSet<Integer> set2 = new HashSet<>();
        for(int i=1;i<=nums.length;i++){
            set2.add(i);
            if(!set1.contains(i)) {
                miss = i;
                break;
            }
        }

        return new int[]{repeat,miss};
    }
}