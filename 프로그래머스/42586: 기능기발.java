import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] done = new int[progresses.length];  
        List<Integer> answer = new ArrayList<>();
        
        for (int i=0; i<progresses.length; i++) {
            done[i] = (100-progresses[i])%speeds[i]==0? (100-progresses[i])/speeds[i]:(100-progresses[i])/speeds[i]+1;
        }
                
        int x = done[0];
        int cnt = 1;
        for(int i=1; i<progresses.length; i++){
            if (x>=done[i]) cnt++;
            else{
                answer.add(cnt);
                cnt = 1;
                x = done[i];
            }
        }
        answer.add(cnt);
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}