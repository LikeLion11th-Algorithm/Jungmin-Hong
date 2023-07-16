import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        String answer = "";
        Arrays.sort(str);
        
        for (int i=str.length-1; i>=0; i--) {
            answer += str[i];
        }
        
        return String.join("",answer);
    }
}