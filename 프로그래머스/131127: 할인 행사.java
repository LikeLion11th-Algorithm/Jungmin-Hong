import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Queue<String> q = new LinkedList<>();

        for (int i=0; i<discount.length-9; i++) {
            for (int n=0; n<want.length; n++) {
                for (int k=0; k<number[n]; k++) q.add(want[n]);
            }
            for (int k=0; k<10; k++) {
                if (q.contains(discount[k+i])) q.remove(discount[k+i]);
            }
            if (q.isEmpty()) answer++;
            q.clear();
        }

        return answer;
    }
}