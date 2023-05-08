class Solution {
    public int solution(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] bomb = new int[row][col];
        int answer = 0;
        
        // ex (3,3) - 9,9
        // (2,2)(2,3)(2,4)(3,2)(3,4)(4,2)(4,3)(4,4)
        int[] X = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] Y = {0, -1, 0, 1, -1, 1, -1, 0, 1};
        
        for (int i=0; i<row; i++) {
            for (int k=0; k<col; k++) {
                if (board[i][k]==1) {
                    for (int n=0; n<9; n++) {
                        int x = i+X[n];
                        int y = k+Y[n];
                        if (x < row && x >= 0 && y < col && y >= 0){
                            bomb[x][y] = 1;
                        }
                    }
                }
            }
        }
        
        // 0 세는 로직
        for (int i=0; i<row; i++) {
            for (int k=0; k<col; k++) {
                if (bomb[i][k] == 0) answer++;
            }
        }
        
        return answer;
    }
}