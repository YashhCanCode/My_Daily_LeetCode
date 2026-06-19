class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, 0, targetSum);
    }
    private boolean dfs(TreeNode node, int sum, int targetSum){
        if(node == null) return false;

        sum += node.val;

        if(node.left == null && node.right == null){
            return sum == targetSum;
        }

    return dfs(node.left, sum, targetSum) || dfs(node.right, sum, targetSum);

    }
}