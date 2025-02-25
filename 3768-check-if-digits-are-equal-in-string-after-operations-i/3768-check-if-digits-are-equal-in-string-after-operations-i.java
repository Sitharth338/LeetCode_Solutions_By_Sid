class Solution {
    public boolean hasSameDigits(String s) {
       
        while(s.length()>2){
             StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length()-1;i++){
                int first = s.charAt(i)-'0';
                int second = s.charAt(i+1)-'0';
                int newdigit = (first+second)%10;
                sb.append(newdigit);
            }
            s=String.valueOf(sb);
        }
        return s.charAt(0)==s.charAt(1);
    }
}