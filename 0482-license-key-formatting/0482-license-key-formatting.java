class Solution {
    public String licenseKeyFormatting(String s, int k) {
       String ans = "";
       for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i)!='-'){
           ans+= Character.toUpperCase(s.charAt(i));
         }
       }
       String res ="";
      for(int i=0;i<ans.length();i++){
        if(i!=0){
        if(i%k==0){
            res+=String.valueOf("-");
        }
        }
        res+=String.valueOf(ans.charAt(i));
      }
      StringBuilder sb = new StringBuilder(res);
      
       return sb.reverse().toString();
    }
}