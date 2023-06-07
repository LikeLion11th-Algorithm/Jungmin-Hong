class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int i=0; i<numbers.length; i++) {
            if ((answer+=numbers[i])>n) break;
        }
        return answer;
    }
}