import java.util.*;

class Solution {
    public String[] solution(String myString) {
        myString = myString.replaceFirst("^x+", "");
        String[] answer = myString.split("[x]+");
        Arrays.sort(answer);
        return answer;
    }
}