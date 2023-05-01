import java.util.*;
class Solution {
    public ArrayList<String> solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<String>();
        for (int i=0; i<quiz.length; i++) {
            String[] str = quiz[i].split(" ");
            int sum = Integer.parseInt(str[0]);
            for (int k=1; k<str.length; k+=2) {
                if (str[k].equals("+")) sum += Integer.parseInt(str[k+1]);
                if (str[k].equals("-")) sum -= Integer.parseInt(str[k+1]);
                if (str[k].equals("=")) {
                    if (sum == Integer.parseInt(str[k+1])) answer.add("O");
                    else answer.add("X");
                }
            }
        }
        return answer;
    }
}