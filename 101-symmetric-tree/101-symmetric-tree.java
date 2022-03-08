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
    public boolean isSymmetric(TreeNode root) {
        return validate(root.left, root.right);  
    }
    public static boolean validate(TreeNode p, TreeNode q) {
        if(p == null && q== null) return true;
        else if(q == null || p == null) return false;
        if(p.val == q.val) {
          return validate(p.left, q.right) && validate(p.right, q.left);
        }else 
        return false;
    }
}