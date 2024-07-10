import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        boolean tf = true;
        
        for (int i=0; i<s.length(); i++) {
            s = s.substring(1)+s.substring(0,1);
            for (char c : s.toCharArray()) {
                if (c=='(' || c=='[' || c=='{') stack.push(c);
                else if (stack.isEmpty()) tf = false;
                else {
                    char b = stack.pop();
                    if ((c==')' && b!='(') ||
                        (c==']' && b!='[') ||
                        (c=='}' && b!='{')) tf = false;
                }
            }
            if (tf && stack.isEmpty()) answer++;
            stack.clear();
            tf = true;
        }
        return answer;
    }
}