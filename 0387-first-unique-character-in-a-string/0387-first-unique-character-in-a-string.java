class Solution {
    public int firstUniqChar(String s) {
        Map<Character,Integer> map =new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

    for(char i : s.toCharArray()){
    if(map.get(i)==1){
        return s.indexOf(i);
    }
  }
  return -1;

    }
}