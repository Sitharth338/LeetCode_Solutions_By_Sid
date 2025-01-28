class Solution {
    public boolean isBalanced(String num) {
      //string
      int oddc=0;
      int evenc=0;
      for(int i=0;i<num.length();i++){
        if(i%2==0) evenc+=num.charAt(i)-'0';
        else oddc+=num.charAt(i)-'0';
  
      }


        if(evenc == oddc){
            return true;
        }
        return false;
    }
}