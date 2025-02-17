class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> list = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                }
            }
        }
        int[] arr = new int[list.size()];
        int i=0;
        for(int num:list){
            arr[i]=num;
            i++;
        }

        return arr;
    }
}