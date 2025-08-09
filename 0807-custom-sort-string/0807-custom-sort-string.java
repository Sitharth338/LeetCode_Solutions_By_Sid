class Solution {
    public String customSortString(String order, String s) {
       StringBuilder s1  = new StringBuilder();
       StringBuilder s2  = new StringBuilder();
       char[] arr = s.toCharArray();
       Arrays.sort(arr);
       HashMap<Character,Integer> map = new HashMap<>();
       for(int i=0;i<arr.length;i++){
        if(order.contains(String.valueOf(arr[i]))){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }else{
            s2.append(arr[i]);
        }
       }
       for(char c : order.toCharArray()){
        if(map.containsKey(c)){
            int freq = map.get(c);
            for(int i=0;i<freq;i++){
            s1.append(c);
            }
        }
       }


  return s1.toString()+s2.toString();
    }
}