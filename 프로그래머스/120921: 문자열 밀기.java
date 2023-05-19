import java.util.*;
class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        for (int k=0; k<A.length(); k++) {
            if (A.equals(B)) return answer;
            String[] a = A.split("");
            String[] str = new String[a.length];
            for (int i=0; i<a.length; i++) {
                if ((i-1)==-1) str[i] = a[a.length-1];
                else str[i] = a[i-1];
            }
            answer++;
            A = String.join("", str);
            System.out.println(A);
        }

        return -1;
    }
}