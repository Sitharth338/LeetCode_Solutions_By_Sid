class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] ans = {0,0};
        for(int i=0;i<mat.length;i++){
            int onec =0;    
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) onec++;
            }
            if(onec>ans[1]){
                ans[1] = onec;
                ans[0] = i;
            }
        }

        return ans;
    }
}