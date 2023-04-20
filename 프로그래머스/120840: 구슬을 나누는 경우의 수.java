class Solution {
    public int solution(int balls, int share) {
        int a = factorial(balls);
        int b = factorial(balls-share)*factorial(share);
        return a/b;
    }
    
    public int factorial(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
}