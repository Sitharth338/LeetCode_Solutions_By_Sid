class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        int copy = num;
        while(copy>0){
           if(copy%2==0){
            copy = copy / 2 ;
            count++;
           }else{
            copy = copy - 1;
            count++;
           }
        }
        return count;
    }
}