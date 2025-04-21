class Solution {
    public int minOperations(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(!list.contains(num))
            list.add(num);
        }
        int c=0;
      
        for(int i=0;i<list.size();i++){
            if( list.get(i)>k){
                c++;
            }
            else if(list.get(i)<k){
                return -1;
            }
           
        }
        if(list.size()==1){
            if(k==list.get(0)) return 0;
        }
        if(c==0){
            return -1;
        }
        return c;
    }
}