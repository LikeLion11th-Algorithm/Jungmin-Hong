import java.util.*;
class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 1-2, 3-4
        if (slope(dots[0], dots[1]) == slope(dots[2], dots[3])) answer = 1;
            
        // 1-3, 2-4
        if (slope(dots[0], dots[2]) == slope(dots[1], dots[3])) answer = 1;

        // 1-4, 2-3
        if (slope(dots[0], dots[3]) == slope(dots[1], dots[2])) answer = 1;
        
        return answer;
    }
    public double slope (int[] dot1, int[] dot2) {
        return (double) (dot1[1]-dot2[1]) / (dot1[0]-dot2[0]);
    }
}