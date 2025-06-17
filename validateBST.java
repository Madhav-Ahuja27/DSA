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
    void inorder(ArrayList<Integer> arr,TreeNode root){
        if(root==null){return;}
        inorder(arr,root.left);
        arr.add(root.val);
        inorder(arr,root.right);


    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(arr,root);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)){return false;}
        }
        return true;
    }
}
