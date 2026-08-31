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
    public List<Integer> postorderTraversal(TreeNode root) {
        postorder(res,root);
        return res;
    }
     public void postorder(List<Integer> res, TreeNode curr)
    {
        if(curr==null)
            return;
        
        postorder(res,curr.left);
        postorder(res,curr.right);
        res.add(curr.val);
    }
}