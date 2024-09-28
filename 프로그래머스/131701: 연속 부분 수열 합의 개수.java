import java.util.*;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();
        
        for (int i=0; i<elements.length; i++) { // 수열에서 나오는 길이;부분수열
            for (int j=0; j<elements.length; j++) { // 부분수열 루프 시작점
                int sum = 0;
                for (int k=0; k<i; k++) { // 부분 수열 길이만큼의 숫자들 합
                    sum += elements[(j+k)%elements.length];
                }
                set.add(sum);
            }
        }
 
        return set.size();
    }
}