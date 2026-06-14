import java.util.Queue;
import java.util.LinkedList;

public class Maximum_Depth_of_BinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }   
        Queue<TreeNode> elementQ = new LinkedList<>();
        elementQ.add(root);
        int number_of_levels = -1;
        while(true){
            int node_count_at_level = elementQ.size();
            if(node_count_at_level == 0){
                return number_of_levels + 1;
            }
            while(node_count_at_level > 0){
                TreeNode element = elementQ.poll();
                if(element.left!=null){
                    elementQ.add(element.left);
                }
                if(element.right!=null){
                    elementQ.add(element.right);
                }
            node_count_at_level--;
            }
        number_of_levels++;  
        }
        
    }
}