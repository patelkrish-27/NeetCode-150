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
    boolean ans = true;
    public int calc(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = 1+calc(root.left);
        int rh = 1+calc(root.right);
        int bal = lh-rh;
        if(bal>1 || bal < -1){
            this.ans = false;
        }
        return Math.max(lh,rh);
    }
    public boolean isBalanced(TreeNode root) {
        calc(root);
        return ans;
    }
}
