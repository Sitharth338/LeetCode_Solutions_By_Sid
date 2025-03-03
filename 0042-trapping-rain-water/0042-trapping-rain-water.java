class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int ans =0;


        while(left<right){

            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);
            ans+=(lmax<rmax) ? lmax - height[left++] : rmax - height[right--];
           // left++;
          // right--;

        }

        return ans;

    }
}