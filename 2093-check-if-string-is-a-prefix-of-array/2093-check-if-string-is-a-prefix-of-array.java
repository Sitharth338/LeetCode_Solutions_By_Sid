class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String W = "";
        for(int i=0;i<words.length;i++){
             W = W + words[i];
              if(W.equals(s)){
            return true;
        }
       
    }
     return false;
       
    
}
}