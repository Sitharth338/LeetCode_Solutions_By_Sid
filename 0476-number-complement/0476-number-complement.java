class Solution {
    public int findComplement(int num) {
        String s  = Integer.toBinaryString(num);
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans+='1';
            }
            else{
                ans+='0';
            }
        }

        return Integer.valueOf(ans,2);
    }
}