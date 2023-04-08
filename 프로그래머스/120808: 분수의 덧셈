class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int gcdDenom = gcd(denom1, denom2);
        int denom = (denom1 * denom2) / gcdDenom;
        int num1 = numer1 * (denom / denom1);
        int num2 = numer2 * (denom / denom2);
        int num = num1 + num2;
        int gcd = gcd(num, denom);
        num = num / gcd;
        denom = denom / gcd;
        int[] answer = { num , denom };
        return answer;
    }
    
    public static int gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return gcd(num2, num1%num2);
    }

}