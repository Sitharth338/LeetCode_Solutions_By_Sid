class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeat=0;
        int missing=0;
        int n = grid.length;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i < n;i++){
            for(int j=0;j < n;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                }
                else{
                    repeat=grid[i][j];
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                missing = i;
                break;
            }
        }
      
    
     return new int[]{repeat,missing};
    }
}