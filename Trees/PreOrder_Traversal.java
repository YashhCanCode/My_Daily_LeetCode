import java.util.ArrayList;
import java.util.List;

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {

        dfs(root);
        return result;
        
    }
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        result.add(node.val);
        dfs(node.left);
        dfs(node.right);
        
    }
}