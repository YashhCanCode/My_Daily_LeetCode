import java.util.*;
class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int v = adj.size();
        boolean[] visited = new boolean[v];
        ArrayList<Integer> ans = new ArrayList<>();
        
        dfs(0, adj, visited, ans);
        return ans;
    }
    public void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> ans){
        
        
        visited[node] = true;
        
        ans.add(node);
        
        for(int neighbor : adj.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor, adj, visited, ans);
            }
        }
    }
    
}