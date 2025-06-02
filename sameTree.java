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
    void solve(TreeNode p, TreeNode q, boolean[] flag){
        if(p==null && q==null){
            return;
        }
        if(p==null || q==null){
            flag[0] = false;
            return;
        }
        while(p.val!=q.val){
            flag[0] = false;
            return;
        }
        solve(p.left,q.left,flag);
        solve(p.right,q.right,flag);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] flag = new boolean[1];
        flag[0] = true;
        solve(p,q,flag);
        return flag[0];
    }
}
