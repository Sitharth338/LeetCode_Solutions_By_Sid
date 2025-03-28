class Solution {
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=5000;i++){
            list.add(i);
        }
        List<Integer> list2 = new ArrayList<>();
           for(int i=0;i<arr.length;i++){
            list2.add(arr[i]);
           }

        List<Integer> set = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(!list2.contains(list.get(i))){
                set.add(list.get(i));
            }
        }

       return set.get(k-1);
    }
}