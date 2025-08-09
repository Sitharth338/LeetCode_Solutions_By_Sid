class Solution {
    public boolean isPowerOfTwo(int n) {
        
   return power(n); }
     static boolean power(int n){
        for(int i=0;i<31;i++){
            int ans = (int )Math.pow(2, i);      //2 power something
            if (ans==n) {
                return true;
            }
            
        }
        return false;
    }
}