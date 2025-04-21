class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num ,map.getOrDefault(num,0)+1);
        }
      //  System.out.print(map);
        int[] arr = new int[k];
       for(int i=0;i<k;i++)
       {
        int ky =0;
        int max=0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            if(entry.getValue()>max) {
                max= entry.getValue();
                ky = entry.getKey();
            }
        }
        arr[i]=ky;
        map.remove(ky);
       }
       return arr;
        
    }
}