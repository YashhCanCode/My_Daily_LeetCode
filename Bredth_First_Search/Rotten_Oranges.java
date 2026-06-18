import java.util.*;
class rotten_oranges {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh=0;
        Queue<int[]> queue = new LinkedList<>();
        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i, j, 0});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int minutes = 0;
        while(queue.size()>0){
        int[] cur = queue.poll();
        int r = cur[0];
        int c = cur[1];
        int t = cur[2];

        minutes = Math.max(minutes, t);

        for(int[] d : dir){
            int nr = r + d[0];
            int nc = c + d[1];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1){
                grid[nr][nc] = 2;
                fresh--;
                queue.offer(new int[]{nr, nc, t+1});
            }
        }
        }
    if(fresh>0) return -1;
    return minutes;
    }

}