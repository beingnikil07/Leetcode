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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();

        if (root == null)
            return list;

        stk.push(root);

        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            list.add(node.val);

            //add right to stack
            if (node.right != null) {
                stk.push(node.right);
            }
            //add left to stack
            if (node.left != null) {
                stk.push(node.left);
            }
        }
        return list;
    }
}