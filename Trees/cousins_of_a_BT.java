import java.util.*;


class Cousins_of_a_BT {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){

            int size = queue.size();
            boolean foundx = false;
            boolean foundy = false;

            for(int i=0;i<size;i++){

                TreeNode node = queue.poll();
                if(node.val == x) foundx = true;
                if(node.val == y) foundy = true;

                if(node.left!=null && node.right!=null){
                    int left = node.left.val;
                    int right = node.right.val;

                    if((left == x && right == y)||(left == y && right == x)){
                        return false;
                    }
                }
                if(node.left!=null) queue.offer(node.left);
                if(node.right!=null) queue.offer(node.right);

            }
            if(foundx && foundy){
                return true;
            }
            if(foundx || foundy){
                return false;
            }
        }
    return false;
    }
}