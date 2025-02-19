class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans ="";
        int j=0;
        int k=0;
        for(int i=0;i<word1.length() + word2.length();i++){
           if(j<word1.length()){
            ans = ans+word1.charAt(j++);
           }
           if(k<word2.length()){
            ans = ans+word2.charAt(k++);
           }
        }

        return ans;
    }
}