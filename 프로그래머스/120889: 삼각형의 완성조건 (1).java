class Solution {
    public int solution(int[] sides) {
        int big_idx = 0;
        for (int i=0; i<2; i++) {
            if (sides[i] < sides[i+1]) big_idx = i+1;
            else big_idx = i;
        }
        int answer = 1;
        int side = sides[0] + sides[1] + sides[2] - sides[big_idx];
        if (side <= sides[big_idx]) answer = 2;
        return answer;
    }
}