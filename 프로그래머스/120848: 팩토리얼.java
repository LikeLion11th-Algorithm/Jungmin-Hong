class Solution {
    public int solution(int n) {
        int num = 0;
        for (int i=1; i<11; i++) {
            if (factorial(i) > n) {
                num = i-1;
                break;
            }
            if (factorial(i) == n) {
                num = i;
                break;
            }
        }
        return num;
    }
    public long factorial(int num) {
        if (num == 1) return 1;
        return factorial(num-1) * num;
    }
}