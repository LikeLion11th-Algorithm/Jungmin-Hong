import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {

        int[] answer = new int[(int)(right-left)+1];
        int[][] arr = new int[n][n];
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = Math.max(i,j)+1;
            }
        }
        
        int[] array = Arrays.stream(arr)
        .flatMapToInt(Arrays::stream)
        .toArray();
        
        answer = Arrays.copyOfRange(array, (int)left, (int)right+1);
        
        return answer;
    }
}