import java.util.*;
class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        boolean lefttoright = true;

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> zigzag = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                
                if(lefttoright){
                    zigzag.add(node.val);
                }
                else{
                    zigzag.add(0, node.val);
                }
                
                
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            result.add(zigzag);
            lefttoright = !lefttoright;
        }
    return result;
        
    }
}