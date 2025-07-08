class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length) return false;

        HashMap<Character,String> map = new HashMap<>();
        HashMap<String,Character> rev = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch  = pattern.charAt(i);
            String word = arr[i];
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(word)) return false;
            }else{
                if(rev.containsKey(word)) return false;
                map.put(ch,word);
                rev.put(word,ch);
            }
        }
        return true;

    }
}