class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x=0, y=0;
        
        for (int i=0; i<keyinput.length; i++) {
            switch (keyinput[i]) {
                case "up":
                    y += 1;
                    if (y > board[1]/2) y -= 1;
                    break;
                case "down":
                    y -= 1;
                    if (y < -board[1]/2) y += 1;
                    break;
                case "left":
                    x -= 1;
                    if (x < -board[0]/2) x += 1;
                    break;
                case "right":
                    x += 1;
                    if (x > board[0]/2) x -= 1;
            }
        }
        
        int[] answer = {x,y};
        return answer;
    }
}