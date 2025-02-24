import java.util.Arrays;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r = ransomNote.toCharArray();
        char[] m = magazine.toCharArray();
        Arrays.sort(r);
        Arrays.sort(m);
        
        int idx = 0;
        for (int i = 0; i < m.length; i++) {
            if (idx < r.length && r[idx] == m[i]) {
                idx++;
            }
        }
        
        return idx == r.length;
    }
}