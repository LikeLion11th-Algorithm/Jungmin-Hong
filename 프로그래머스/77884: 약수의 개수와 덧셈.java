class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i=left; i<=right; i++) {
            int cnt = 0;
            for (int k=1; k<=i; k++) {
                if (i%k==0) cnt++;
            }
            answer += cnt%2==0 ? i:-i;
        }
        return answer;
    }
}