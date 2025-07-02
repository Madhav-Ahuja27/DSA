class Solution {
    void solve(List<String> ans, TreeNode root, StringBuilder str) {
        if (root == null) return;

        int len = str.length(); // store current length for backtracking
        str.append(root.val);

        if (root.left == null && root.right == null) {
            // It's a leaf node, add the current path
            ans.add(str.toString());
        } else {
            str.append("->");
            solve(ans, root.left, str);
            solve(ans, root.right, str);
        }

        str.setLength(len); // backtrack to previous state
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        solve(ans, root, str);
        return ans;
    }
}
