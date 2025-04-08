class Solution {
    public int findLucky(int[] arr) {
        int max=0;
       int ans=0;
       boolean f = true;
        for(int i=0;i<arr.length;i++){
            int c=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==arr[i]){
             ans = arr[i];
             f = false;
            }
            max = Math.max(ans,max);
        }
        if(f){
            return -1;
        }
        return max;
       // return -1;
    }
}