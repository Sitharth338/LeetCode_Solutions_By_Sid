class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       
        Set<Integer> set1 = new HashSet<>();
         Set<Integer> set2 = new HashSet<>();

         for(int num1:nums1){
            set1.add(num1);
         }
         for(int num2:nums2){
            set2.add(num2);
         }

         List<Integer> list1 = new ArrayList<>();
         List<Integer> list2 = new ArrayList<>();

         for(int n : set1){
            if(!set2.contains(n)){
                list1.add(n);
            }
         }

         for(int m : set2){
            if(!set1.contains(m)){
                list2.add(m);
            }
         }

         return Arrays.asList(list1,list2);


    }
}