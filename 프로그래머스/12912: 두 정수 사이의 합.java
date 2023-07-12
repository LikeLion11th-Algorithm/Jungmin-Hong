class Solution {
    public long solution(int a, int b) {
        int x = Math.min(a,b);
        int y = Math.max(a,b);
        long answer = x;
        while (x!=y) {
            answer += ++x;
        }
        return answer;
    }
}