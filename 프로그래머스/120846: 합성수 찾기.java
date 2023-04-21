class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i=4; i<=n; i++) {
            if (factor(i) >= 3) answer++;
        }
        return answer;
    }
    public int factor(int num) {
        int cnt = 0;
        for (int i=1; i<=num ;i++) {
            if (num%i == 0) cnt++;
        }
        return cnt;
    }
}