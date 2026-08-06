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
    int max = 0;
    public int height(TreeNode root){
         if(root == null){
            return -1;
        }
        int lh = 1+ height(root.left);
        int rh = 1+height(root.right);
        this.max = Math.max(max,(lh+rh));
        return Math.max(lh,rh);

    }
    public int  diameterOfBinaryTree(TreeNode root) {
       height(root);
       return max;
    }
}
