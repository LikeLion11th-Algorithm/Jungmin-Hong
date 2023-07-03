import java.math.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int len = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[len][len];
        for (int i=0; i<arr.length; i++) {
            for (int k=0; k<arr[0].length; k++) {
                answer[i][k] = arr[i][k];
            }
        }
        return answer;
    }
}