class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int n = 1;
        int[][] board = new int[rows][columns];
        for (int i=0; i<rows; i++) {
            for (int k=0; k<columns; k++) {
                board[i][k] = n++;
            }
        }
        
        for (int i=0; i<queries.length; i++){
            int[] minpos = {queries[i][0]-1, queries[i][1]-1};
            int[] maxpos = {queries[i][2]-1, queries[i][3]-1};  
            
            // 원본 값 저장
            int tmp = board[minpos[0]][minpos[1]];
            // 이동 수 중 최솟값 저장할 변수
            int minimum = tmp;
            
            // 1. 왼쪽 열 아래에서 위로 하나씩 덮어씌우기
            for (int x=minpos[0]; x<maxpos[0]; x++) {
                board[x][minpos[1]] = board[x+1][minpos[1]];
                minimum = Math.min(minimum, board[x][minpos[1]]);
            }
            
            // 2. 밑쪽 행 오른쪽에서 왼쪽으로 하나씩 덮어씌우기
            for (int y=minpos[1]; y<maxpos[1]; y++) {
                board[maxpos[0]][y] = board[maxpos[0]][y+1];
                minimum = Math.min(minimum, board[maxpos[0]][y]);
            }
            
            // 3. 오른쪽 열 위에서 아래로 하나씩 덮어씌우기
            for (int x=maxpos[0]; x>minpos[0]; x--) {
                board[x][maxpos[1]] = board[x-1][maxpos[1]];
                minimum = Math.min(minimum, board[x][maxpos[1]]);
            }
            
            // 4. 위쪽 행 왼쪽에서 오른쪽으로 하나씩 덮어씌우기 (tmp값 주의하기)
            for (int y=maxpos[1]; y>minpos[1]+1; y--) {
                board[minpos[0]][y] = board[minpos[0]][y-1];
                minimum = Math.min(minimum, board[minpos[0]][y]);
            }
            board[minpos[0]][minpos[1]+1] = tmp;
            answer[i] = minimum;
        }
        
        
        return answer;
    }
}