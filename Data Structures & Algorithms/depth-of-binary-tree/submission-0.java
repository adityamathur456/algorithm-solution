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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        Stack<Map.Entry<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new AbstractMap.SimpleEntry<>(root, 1));

        int maxDepth = 0;

        while (!stack.isEmpty()) {
            Map.Entry<TreeNode, Integer> current = stack.pop();
            TreeNode node = current.getKey();
            int depth = current.getValue();

            if (node != null) {
                maxDepth = Math.max(maxDepth, depth);
                stack.push(new AbstractMap.SimpleEntry<>(node.left, depth + 1));
                stack.push(new AbstractMap.SimpleEntry<>(node.right, depth + 1));
            }
        }

        return maxDepth;
    }
}
