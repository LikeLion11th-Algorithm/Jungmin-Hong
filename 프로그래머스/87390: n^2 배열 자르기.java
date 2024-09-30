import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {

        int[] answer = new int[(int)(right-left)+1];
        
        // 메모리 초과를 피하기 위해 필요한 부분의 배열 값만 얻어오기
        int idx = 0;
        for (long i=left; i<=right; i++) {
            int row = (int) (i/n);
            int col = (int) (i%n);
            answer[idx++] = Math.max(row,col)+1;
        }       
        return answer;
    }
}