import java.lang.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i=1; i<=number; i++) {
            int cnt = 0;
            for (int k=1; k<=Math.sqrt(i); k++) {
                if (i % k == 0) {
                    cnt++;
                    if (i/k != k) cnt++;
                }
            }
            answer += cnt>limit ? power:cnt;
        }
        
        return answer;
    }
}