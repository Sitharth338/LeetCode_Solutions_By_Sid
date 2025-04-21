class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++){
            String s = words[i];
            for(int j=i+1;j<words.length;j++){
                String t = words[j];
                if(t.startsWith(s) && t.endsWith(s)) c++;
            }
        }
        return c;
    }
}