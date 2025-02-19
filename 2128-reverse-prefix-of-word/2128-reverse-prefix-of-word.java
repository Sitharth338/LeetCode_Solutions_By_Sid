class Solution {
    public String reversePrefix(String word, char ch) {
        int k=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
              k=i;
              break;
            }
        }

        StringBuilder sb = new StringBuilder(word.substring(0,k+1));
        sb=sb.reverse();
        String ans = String.valueOf(sb);
        for(int i=k+1;i<word.length();i++){
            ans = ans+word.charAt(i);
        }
        return ans;
    }
}