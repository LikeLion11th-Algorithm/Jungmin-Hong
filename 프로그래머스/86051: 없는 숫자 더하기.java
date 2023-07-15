import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        ArrayList<Integer> num = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            num.add(numbers[i]);
        }
        
        for (int i=0; i<10; i++) {
            if (!num.contains(i)) answer += i;
        }
            
        return answer;
    }
}