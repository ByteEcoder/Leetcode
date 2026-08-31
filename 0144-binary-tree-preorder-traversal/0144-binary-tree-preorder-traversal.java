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
    List<Integer> res=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(res,root);
        return res;
    }
    public void preorder(List<Integer> res, TreeNode curr)
    {
        if(curr==null)
            return;
        
        res.add(curr.val);
        preorder(res,curr.left);
        preorder(res,curr.right);
    }
}