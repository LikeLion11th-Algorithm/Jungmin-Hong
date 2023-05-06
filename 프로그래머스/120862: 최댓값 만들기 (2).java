import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int idx = numbers.length;
        int answer = numbers[idx-1] * numbers[idx-2];
        if ((numbers[0]*numbers[1]) > answer) answer = numbers[0]*numbers[1];
        return answer;
    }
}