import java.util.*;
class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        
        visited[0] = true;
        
        while(!queue.isEmpty()){
            int node = queue.poll();
            ans.add(node);
            
            for(int neighbor : adj.get(node)){
                if(!visited[neighbor]){
                    visited[neighbor]= true;
                    queue.offer(neighbor);
                }
            }
        }
    return ans;
        
    }
} 