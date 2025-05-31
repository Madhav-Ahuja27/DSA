class Solution {
public:
    int maxDiameter = 0;

    int height(TreeNode* node) {
        if (node == nullptr) return 0;
        
        int leftHeight = height(node->left);
        int rightHeight = height(node->right);
        
        // Update the diameter if the path through root is larger
        maxDiameter = std::max(maxDiameter, leftHeight + rightHeight);
        
        // Return height of this node
        return 1 + std::max(leftHeight, rightHeight);
    }

    int diameterOfBinaryTree(TreeNode* root) {
        height(root);
        return maxDiameter;
    }
};
