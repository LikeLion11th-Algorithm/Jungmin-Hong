import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int idx = 0;
        int k = 0;
        for (int i=0; i<answer.length; i++) {
            if (k==arr[idx]) {
                idx++;
                k=0;
            }
            answer[i] = arr[idx];
            k++;
        }
        
        return answer;
    }
}