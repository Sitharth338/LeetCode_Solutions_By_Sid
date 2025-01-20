class Solution {
    public void rotate(int[][] matrix) {
       int[][] ans = new int[matrix.length][matrix.length];
       int k=0;
       while(k<matrix.length){
        for(int i=0;i<matrix.length;i++){
            ans[k][i] = matrix[matrix.length-1-i][k];

        }
        k++;
       } 

       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix.length;j++){
            matrix[i][j] = ans[i][j];
        }
       }
    }
}