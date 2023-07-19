import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<Long>();
        
        while (n!=0) {
            list.add(n%10);
            n /= 10;
        }
        
        list.sort(Comparator.reverseOrder());
        for (int i=0; i<list.size(); i++) {
            answer *= 10;
            answer += list.get(i);
        }
        
        return answer;
    }
}