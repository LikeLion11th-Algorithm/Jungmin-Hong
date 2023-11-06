import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        StringBuilder sb = new StringBuilder();

        int[] answer = new int[s.length()];
        Arrays.fill(answer, -1);
        
        char[] c = s.toCharArray();

        for (int i=0; i<answer.length; i++) {
            if (sb.toString().contains(String.valueOf(c[i]))) {
                answer[i] = i-sb.lastIndexOf(String.valueOf(c[i]));
            }
            sb.append(c[i]);
        }

        return answer;
    }
}