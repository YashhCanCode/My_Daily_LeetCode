class FloodFill_Algorithm {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int newcolor, int oldcolor){
        int row = image.length;
        int col = image[0].length;
        if(i<0 || j<0 || i>=row || j>=col || image[i][j] != oldcolor || image[i][j] == newcolor){
            return;
        }


        image[i][j] = newcolor;
        dfs(image, i-1, j , newcolor, oldcolor);
        dfs(image, i+1, j, newcolor, oldcolor);
        dfs(image, i, j-1, newcolor, oldcolor);
        dfs(image, i, j+1, newcolor, oldcolor);
    }
}