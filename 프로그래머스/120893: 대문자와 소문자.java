import java.util.*;

class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String answer = "";
        
        for (int i=0; i<str.length; i++) {
            char c = my_string.charAt(i);
            if ((int) c <= 90) answer += str[i].toLowerCase();
            else answer += str[i].toUpperCase();
        }
        
        return answer;
    }
}