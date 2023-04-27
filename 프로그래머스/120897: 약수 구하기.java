import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(1);
        int i=2;
        while (n != 1) {
            if (n%i == 0) {
                answer.add(i);
                if (n==i) break;
            }
            i++;
        }
        return answer;
    }
}