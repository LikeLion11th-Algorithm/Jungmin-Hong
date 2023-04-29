import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split("");
        Arrays.sort(str);
        String answer = "";
        int cnt = 0;
        for (int i=0; i<str.length; i++) {
            cnt = 0;
            for (int k=0; k<str.length; k++) {
                if (str[i].equals(str[k])) cnt++;
            }
            if (cnt == 1) answer += str[i];
        }
        return answer;
    }
}