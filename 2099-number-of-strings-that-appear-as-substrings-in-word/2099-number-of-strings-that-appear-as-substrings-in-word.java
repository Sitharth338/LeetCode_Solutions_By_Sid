class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(int i=0;i<patterns.length;i++){
            String s = patterns[i];
            if(word.contains(s)) c++;
        }
        return c;
    }
}