import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> playerRank = new HashMap<>();

        // 선수들의 등수를 초기화
        for (int i = 0; i < players.length; i++) {
            playerRank.put(players[i], i);
        }
        
        for (int i=0; i<callings.length; i++) {
            int idx = playerRank.get(callings[i]);
            playerRank.put(callings[i], idx-1);
            playerRank.put(players[idx-1], idx);
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