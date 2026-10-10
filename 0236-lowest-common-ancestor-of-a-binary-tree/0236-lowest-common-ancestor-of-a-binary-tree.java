/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         // Base case
        if (root == null || root == p || root == q) {
            return root;
        }

        // Search left and right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // Both nodes found in different subtrees
        if (left != null && right != null) {
            return root;
        }

        // Return non-null result
        return left != null ? left : right;
    }
}