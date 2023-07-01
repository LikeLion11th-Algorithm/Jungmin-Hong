class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int idx=1;
        int sRow=0, sCol=0;
        int eRow=n-1, eCol=n-1;
        
        while (sRow<=eRow && sCol<=eCol) {
            // 뒤가 증가, 시작이 +1
            for (int i=sCol; i<=eCol; i++) {
                answer[sRow][i] = idx++;
            }
            sRow++;
            
            // 앞이 감소, 끝이 -1
            for (int i=sRow; i<=eRow; i++) {
                answer[i][eCol] = idx++;
            }
            eCol--;
            
            // 뒤가 감소, 끝이 -1
            for (int i=eCol; i>=sCol; i--) {
                answer[eRow][i] = idx++;
            }
            eRow--;
            
            // 앞이 감소, 시작이 +1
            for (int i=eRow; i>=sRow; i--) {
                answer[i][sCol] = idx++;
            }
            sCol++;
        }
        
        return answer;
    }
}