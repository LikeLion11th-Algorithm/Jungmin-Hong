import java.util.*;
class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        double[] sort = new double[score.length];
        int[] rank = new int[score.length];
        
        for (int i=0; i<score.length; i++) {
            answer[i] = (score[i][0]+score[i][1])/2.0;
            sort[i] = (score[i][0]+score[i][1])/2.0;
        }
        Arrays.sort(sort);
        
        for (int k=0; k<answer.length; k++) {
            for (int i=sort.length-1; i>=0; i--) {
                if (sort[i]==answer[k]) {
                    rank[k] = answer.length-i;
                    break;
                }
            }
        }
        
        return rank;
    }
}