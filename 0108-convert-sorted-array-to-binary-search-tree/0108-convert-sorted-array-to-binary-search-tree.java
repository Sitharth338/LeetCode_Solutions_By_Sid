/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return insert(nums , 0 , nums.length);
    }
    TreeNode insert(int[] nums , int s , int e){
        if(s==e) return null;
        int mid  = (s+e)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left  = insert(nums,s,mid);
        node.right = insert(nums,mid+1,e);
        return node;
    }
}