import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] b = before.split("");
        Arrays.sort(b);
        before = String.join("", b);
        String[] a = after.split("");
        Arrays.sort(a);
        after = String.join("", a);
        if (before.equals(after)) answer = 1;
        return answer;
    }
}