class Solution {
    public boolean isMatch(String s, String p) {
      return s.replaceFirst(p,"").length()==0;
    }
}