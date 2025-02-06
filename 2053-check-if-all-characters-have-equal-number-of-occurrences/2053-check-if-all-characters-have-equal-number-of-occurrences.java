class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] chars = new int[26];
        for(char c : s.toCharArray()){
            chars[c - 97] = chars[c-97]+1;
        }

        int expect =0;
        for(int count : chars){
            if(count==0) continue;
            if(expect==0) expect = count;
            if(expect != count) return false;
        }

        return true;
    }
}