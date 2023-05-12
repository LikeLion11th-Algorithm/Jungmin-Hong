class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int[] cnt = new int[200];
        
        // 모든 선분을 긋고, 선분이 2개 이상이면 계산
       
        for (int i=0; i<3; i++) {
            for (int k=lines[i][0]+100; k<lines[i][1]+100; k++) {
                cnt[k]++;
            }
        }
        
        for (int i=0; i<200; i++) {
            if (cnt[i] > 1) answer++;
        }
        
        return answer;
    }
}