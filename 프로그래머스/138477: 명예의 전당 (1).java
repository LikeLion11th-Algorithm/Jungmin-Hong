import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> rank = new ArrayList<Integer>();
        
        for (int i=0; i<score.length; i++) {
            rank.add(score[i]);
            rank.sort(Comparator.naturalOrder());
            if (rank.size()>k)
                rank.remove(0);
            answer[i] = rank.get(0);
        }
        
        return answer;
    }
}