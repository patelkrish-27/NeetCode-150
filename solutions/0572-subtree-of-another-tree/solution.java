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
    public boolean checkSame(TreeNode p,TreeNode q){
        if(p == null && q == null) return true;
        else if(p == null) return false;
        else if(q == null) return false;
        return p.val == q.val && checkSame(p.left,q.left) && checkSame(p.right,q.right);

    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) return true;
        else if(root == null) return false;
        else if(subRoot == null) return false;
        return checkSame(root,subRoot) || isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
}
