import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int diff = Math.max(sides[0], sides[1])-Math.min(sides[0], sides[1])+1;
        int sum = Math.max(sides[0], sides[1])+Math.min(sides[0], sides[1])-1;
        if (diff == sum) return 1;
        int answer = sum - diff + 1;
        return answer;
    }
}