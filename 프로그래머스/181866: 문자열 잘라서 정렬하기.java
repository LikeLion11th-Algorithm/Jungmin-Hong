import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("[x]+");
        Arrays.sort(answer);
        return answer;
    }
}