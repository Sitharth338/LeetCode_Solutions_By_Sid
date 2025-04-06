class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for(int num:nums){
            list1.add(num);
        }
        while(list1.size()>1){
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int i=0;i<list1.size()-1;i++){
                int n = (list1.get(i)+list1.get(i+1))%10;
                list2.add(n);
            }
            list1 = list2;
        }
        return list1.get(0);
    }
} 