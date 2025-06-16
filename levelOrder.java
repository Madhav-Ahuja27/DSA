import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class levelOrder {
        static void lorder(TreeNode root, List<Integer> lst){
            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                if(q.peek().left!=null){q.add(q.peek().left);}
                if(q.peek().right!=null){q.add(q.peek().right);}
                lst.add(q.remove().val);
            }
        }
        public static void main(String[] args){

        // Creating this sample tree:
        //        1
        //       / \
        //      2   3
        //     / \
        //    4   5

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        List<Integer> lst = new ArrayList<>();
        lorder(root,lst);
        for(int ele:lst){System.out.println(ele+" ");}
    }
}
