class Solution {
    public boolean squareIsWhite(String s) {
        if((s.charAt(0)-'a' + s.charAt(1)-'0' +1)%2!=0) return true;
        return false;
    }
}