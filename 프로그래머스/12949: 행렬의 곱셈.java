import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for (int i=0; i<answer.length; i++) {
            for (int k=0; k<answer[0].length; k++) {
                for (int n=0; n<arr2.length; n++) {
                    answer[i][k] += arr1[i][n]*arr2[n][k];
                }
            }
        }
        
        return answer;
    }
}