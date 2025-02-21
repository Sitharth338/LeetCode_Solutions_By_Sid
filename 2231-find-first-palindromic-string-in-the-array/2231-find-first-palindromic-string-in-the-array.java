class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String a = words[i];
            StringBuilder sb = new StringBuilder(a);
            sb=sb.reverse();
            String b = String.valueOf(sb);
            if(a.equals(b)){
                return a;
            }
        }
        return "";
    }
}