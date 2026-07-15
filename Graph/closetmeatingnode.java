import java.util.Arrays;
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = new int[n];
        int[] dist2 = new int[n];

        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);

        findDistance(edges, node1, dist1);
        findDistance(edges, node2, dist2);

        int answer = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(dist1[i] != -1 && dist2[i] != -1){
                int maxDistance = Math.max(dist1[i], dist2[i]);

                if(maxDistance < minDistance){
                    minDistance = maxDistance;
                    answer = i;
                }
            }
        }

    return answer;
    }
    private void findDistance(int[] edges, int start, int[] dist){
        int current = start;
        int distance = 0;

        while(current != -1 && dist[current] == -1){
            dist[current] = distance;
            distance++;
            current = edges[current];
        }
    }
}