import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) { //hashtable + sorting
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> sorted = new ArrayList<>(map.keySet());
        sorted.sort((a,b) -> map.get(b) - map.get(a));

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = sorted.get(i);
        }
    return result;
    }
}