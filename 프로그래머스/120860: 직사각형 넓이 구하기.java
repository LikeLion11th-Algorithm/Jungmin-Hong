import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int x1=dots[0][0];
        int y1=dots[0][1];
        int x=0, y=0;
        for (int i=1; i<4; i++) {
            if (dots[i][0] != x1) x = Math.abs(x1-dots[i][0]);
            if (dots[i][1] != y1) y = Math.abs(y1-dots[i][1]);
        }
        
        int answer = x*y;
        return answer;
    }
}