import java.math.*;

class Solution {
    public long solution(long n) {
        int x = Math.sqrt(n);
        long answer = Math.pow(x,2)==n ? (long)Math.pow(x+1, 2):-1;
        
        return answer;
    }
}