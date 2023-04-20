class Solution {
    public long solution(int balls, int share) {
        long sum1 = 1;
        long sum2 = 1;
        for (int i=0; i<balls-share+1; i++) {
            sum1 *= balls--;
            sum2 *= share--;
        }
        return sum1/sum2;
    }
}