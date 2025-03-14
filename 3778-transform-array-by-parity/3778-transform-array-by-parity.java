class Solution {
    public int[] transformArray(int[] ans) {
     
        for(int i=0;i<ans.length;i++){
            ans[i] = (ans[i]%2==0)?0:1;
        }
      Arrays.sort(ans);
        return ans;
    }
}