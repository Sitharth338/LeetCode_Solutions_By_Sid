class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String ans = "";
       HashSet<String> set = new HashSet<>();
         for(int i=0;i<words.length;i++){
            String e = words[i];
            if(e.length()==1|| set.contains(e.substring(0,e.length()-1))){
                if(e.length()>ans.length()){
                    ans = e;
                }
                set.add(e);
            }
         }
         return ans;
    }
}