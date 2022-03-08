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
    public static int max;
    public int maxDepth(TreeNode root) {
        max = Integer.MIN_VALUE;
        check(root, 0);
        return max;
    }
    public static void check(TreeNode node, int height) {
        if(node == null) {
            max = Math.max(max, height);
            return;
        }
        if(node != null) {
            check(node.left, height+1);
            check(node.right, height+1);
        }
    }
}