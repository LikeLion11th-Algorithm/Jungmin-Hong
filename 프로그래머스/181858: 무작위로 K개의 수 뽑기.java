import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        int idx=0;
        for (int i=0; i<arr.length; i++) {
            if (find(answer, arr[i])) {
                if (idx==k) break;
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
    public boolean find(int[] arr, int x) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==x) return false;
        }
        return true;
    }
}