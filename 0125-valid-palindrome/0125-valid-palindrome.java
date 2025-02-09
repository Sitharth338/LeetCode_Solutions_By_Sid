class Solution {
    public boolean isPalindrome(String s) {
        String a =s.toLowerCase();
        String d = "";
        for(int i=0;i<a.length();i++){
           // if(a.charAt(i)>='a' && a.charAt(i)<='z'||a.charAt(i)>='A' && a.charAt(i)<='Z')
           if(Character.isLetterOrDigit(a.charAt(i)))
           {
               d=d+a.charAt(i);
            }
        }

        StringBuilder rev = new StringBuilder(d);
        rev = rev.reverse();
        String f = String.valueOf(rev);
        if(f.equals(d)){
            return true;
        }
        return false;
    }
}