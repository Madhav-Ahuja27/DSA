class Solution {
public:
    void dfs(TreeNode* node, vector<int>& result) {
        if (node == nullptr) return;
        result.push_back(node->val);        // Visit root
        dfs(node->left, result);            // Traverse left
        dfs(node->right, result);           // Traverse right
    }

    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        dfs(root, result);
        return result;
    }
};
