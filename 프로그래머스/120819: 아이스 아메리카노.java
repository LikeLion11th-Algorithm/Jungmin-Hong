class Solution {
    public int[] solution(int money) {
        int num = money/5500;
        money = money - (5500*num);
        int[] answer = {num, money};
        return answer;
    }
}