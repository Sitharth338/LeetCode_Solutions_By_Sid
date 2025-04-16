class Solution {
    public int mostFrequent(int[] nums, int key) {
        //key----value
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
           if(nums[i]==key){
            int target = nums[i+1];
            map.put(target,map.getOrDefault(target,0)+1);

           }
        }

        int maxfreq=0;
        int res =0;
        for(int num : map.keySet()){
            if(map.get(num)>maxfreq){
                maxfreq = map.get(num);
                res=num;
            }
        }
        return res;
    }
}