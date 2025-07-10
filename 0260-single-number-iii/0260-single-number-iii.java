class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int[] arr = new int[2];
        int k=0;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                arr[k++] = entry.getKey();
                if(k==2) break;
            }
        }
     return arr;
    }
}