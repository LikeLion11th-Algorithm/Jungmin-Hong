import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        for (int i=0; i<participant.length; i++) {
            int idx = Arrays.asList(completion).indexOf(participant[i]);
            if (idx == -1) answer = participant[i];
            else completion[idx] = "";
        }
        
        return answer;
    }
}