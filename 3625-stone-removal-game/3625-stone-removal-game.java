class Solution {
    public boolean canAliceWin(int n) {
       
        int alice=1;
        int remove=10;
        while(n>=remove){
            n=n-remove;
            remove--;
            alice++;
        }
        if(alice%2==0){
            return true;
        }
        return false;
    }
}