class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        String v = "AEIOUaeiou";
        for(int i=left;i<=right;i++){
            String s = words[i];
            if(v.contains(String.valueOf(s.charAt(0))) && v.contains(String.valueOf(s.charAt(s.length()-1)))){
                count++;
            }
        }
        return count;
    }
}