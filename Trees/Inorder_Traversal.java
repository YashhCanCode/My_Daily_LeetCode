import java.util.List;
import java.util.ArrayList;

class InorderTraversal {
    List<Integer> result = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {

        dfs(root);
        return result;
        
    }
    private void dfs(TreeNode node){
        if(node == null){
            return;
        }
        dfs(node.left);
        result.add(node.val);
        dfs(node.right);
    }
}