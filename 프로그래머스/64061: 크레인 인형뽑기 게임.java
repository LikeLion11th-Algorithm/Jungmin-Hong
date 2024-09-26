import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        
        for (int i=0; i<moves.length; i++) {
            int n = moves[i]-1;
            int k=0;
            while (k<board.length && board[k][n]==0) {
                k++;
            }
            if (k>=board.length) continue;
            else {
                if (!stack.isEmpty() && stack.peek()==board[k][n]) {
                    stack.pop();
                    answer += 2;
                }
                else stack.push(board[k][n]);
                board[k][n]=0;
            }
        }
        
        return answer;
    }
}