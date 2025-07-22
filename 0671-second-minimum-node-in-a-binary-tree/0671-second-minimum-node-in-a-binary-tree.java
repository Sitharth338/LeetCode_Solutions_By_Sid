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
    public int findSecondMinimumValue(TreeNode root) {
        return sec(root,root.val);
    }
    public int sec(TreeNode root , int min){
        if(root==null) return -1;
        if(root.val>min) return root.val;
        int left = sec(root.left,min);
        int right = sec(root.right,min);
        if(left!=-1 && right!=-1) return Math.min(left,right);
        return left!=-1 ? left : right;
    }
}