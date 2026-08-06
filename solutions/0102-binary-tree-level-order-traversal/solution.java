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
    List<List<Integer>> list = new ArrayList<>();
    public void order(TreeNode root,int level){
        if(root == null) return;
        if(list.size() == level){
            list.add(new ArrayList<>());
        }
        list.get(level).add(root.val);
        order(root.left,level+1);
        order(root.right,level+1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null)   return list;
        order(root,0);
        return list;
    }
}
