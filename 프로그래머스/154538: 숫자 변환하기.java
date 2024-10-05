import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[x] = 0;
        
        for (int i=x; i<=y; i++) {
            // 애초에 확인할 값이 구해지지 않은 값이라면 굳이 할 필요 X
            if (dp[i]==Integer.MAX_VALUE) continue;
            
            if (i+n<=y) dp[i+n] = Math.min(dp[i]+1, dp[i+n]);
            if (i*2<=y) dp[i*2] = Math.min(dp[i]+1, dp[i*2]);
            if (i*3<=y) dp[i*3] = Math.min(dp[i]+1, dp[i*3]);
        }
        
        if (dp[y]==Integer.MAX_VALUE) return -1;
                
        return dp[y];
    }
}