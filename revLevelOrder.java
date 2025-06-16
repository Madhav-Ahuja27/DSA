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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // add root to the queue

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // number of nodes at current level
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll(); // remove from front
                currentLevel.add(node.val);

                if (node.left != null) queue.offer(node.left); // add left child
                if (node.right != null) queue.offer(node.right); // add right child
            }
            //Collections.reverse(currentLevel);
            result.add(currentLevel);
        }
        Collections.reverse(result);
        return result;
    }
}
