import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        for (int i=0; i<callings.length; i++) {
            int idx = Arrays.asList(players).indexOf(callings[i]);
            swap(idx, idx-1, players);
        }
        
        return players;
    }
    
    public void swap(int idx1, int idx2, String[] arr) {
        String tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }
}