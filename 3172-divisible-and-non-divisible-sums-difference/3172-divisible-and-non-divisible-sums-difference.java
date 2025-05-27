class Solution {
    public int differenceOfSums(int n, int m) {
        int k=0;
        int count=0;
       for(int i=1;i<=n;i++){

        if(i%m==0) count=count+i;
        
        if(i%m!=0) k=k+i;
            
       
        } 
        return k-count;
    }
}