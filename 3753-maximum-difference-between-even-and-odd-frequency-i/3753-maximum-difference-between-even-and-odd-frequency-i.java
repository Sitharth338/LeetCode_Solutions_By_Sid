class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
        int minc = Integer.MAX_VALUE;
        int maxc = 0;
        for(int count : freq){
            if(count == 0) continue;
            if(count%2==0){
                minc = Math.min(count,minc);
            }
            else{
                maxc = Math.max(count,maxc);
            }
        }

        return maxc - minc ;
    }
}