class Solution {
    public int trap(int[] height) {
        int left =0;
        int right = height.length-1;
        int leftmax = Integer.MIN_VALUE;
        int rightmax = Integer.MIN_VALUE;
        int totalWater =0;


        while(left<=right){

            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax,height[right]);
            if (leftmax < rightmax) {
                totalWater += leftmax - height[left];  
                left++;
            } 
            else {
                totalWater += rightmax - height[right];  
                right--;
            }

        }

        return totalWater;

    }
}