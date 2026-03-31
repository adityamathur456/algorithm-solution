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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> rightView = new ArrayList<>();
        if (root == null) return rightView;
        dfs(root, rightView, 0);
        return rightView;
    }

    private void dfs(TreeNode root, List<Integer> rightView, int level) {
        if (root == null) return; 

        if (rightView.size() == level) {
            rightView.add(root.val);
        }

        dfs(root.right, rightView, level + 1);
        dfs(root.left, rightView, level + 1);
    }
}
