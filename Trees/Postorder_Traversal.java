import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {

        dfs(root);
        return result;
        
    }
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        dfs(node.right);
        result.add(node.val);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}