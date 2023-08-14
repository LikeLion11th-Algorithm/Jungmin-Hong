import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        
        // 0-9의 숫자 개수를 셀 int 배열
        int[] x = new int[10];
        int[] y = new int[10];
        
        // 숫자 몇개씩 있는지 세기
        for (int i=0; i<X.length(); i++) {
            x[Character.getNumericValue(X.charAt(i))]++;
        }
        for (int i=0; i<Y.length(); i++) {
            y[Character.getNumericValue(Y.charAt(i))]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i=9; i>=0; i--) {
            int min = Math.min(x[i], y[i]);
            for (int k=0; k<min; k++) {
                sb.append(i);
            }
        }
        
        String answer = sb.toString();
        if (answer.equals("")) return "-1";
        if (answer.equals("0".repeat(answer.length()))) return "0";
        
        return answer;
    }
}