import java.math.*;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        // 둘 다 홀수
        if (a%2!=0 && b%2!=0) {
            answer = (int) Math.pow(a,2) + (int) Math.pow(b,2);
        }
        // 둘 다 짝수
        else if (a%2==0 && b%2==0) {
            answer = Math.abs(a-b);
        }
        // 그 외 = 하나씩
        else {
            answer = 2*(a+b);
        }
        
        return answer;
    }
}