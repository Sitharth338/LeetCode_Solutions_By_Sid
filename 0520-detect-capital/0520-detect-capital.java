class Solution {
    public boolean detectCapitalUse(String word) {
        int len = word.length();
           int countcap =0;
         for(int i=0;i<len;i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                countcap++;

            }
         }
           return ((countcap==0)||(countcap==len)||(countcap==1 && word.charAt(0)>='A' && word.charAt(0)<=90));
     }
}