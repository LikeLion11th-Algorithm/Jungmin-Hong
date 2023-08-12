import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        
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
        
        // 맨 뒤에서부터 둘 중 작은 개수만큼 answer에 추가
        for (int i=9; i>=0; i--) {
            int min = Math.min(x[i], y[i]);
            for (int k=0; k<min; k++) {
                answer += Integer.toString(i);
            }
        }
        
        return answer.equals("") ? "-1":String.valueOf(Integer.parseInt(answer));
    }
}