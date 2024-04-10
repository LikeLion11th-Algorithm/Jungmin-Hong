import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 1;

        // 나누기 2를 하다가 홀수가 나올 때, 에너지 +1
        while (n>1) {
            if (n%2 != 0) ans++;
            n /= 2;
        }

        return ans;
    }
}