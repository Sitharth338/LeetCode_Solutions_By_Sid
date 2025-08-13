class Solution {
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<31;i++){

            
             if(n<0){
                return false;
            }
            if((Math.pow(3,i))==n){
                return true;
            }
           

        }
        return false;
    }
}