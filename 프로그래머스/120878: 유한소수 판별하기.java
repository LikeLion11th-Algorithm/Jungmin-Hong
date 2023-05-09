class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        b = b/gcd(a, b);
        int i=2;
        while (b != 1) {
            if (b%i == 0) {
                if (i != 2 && i!=5) {
                    answer = 2;
                    break;
                }
                while (b%i==0) {
                    b /= i;
                }
            }
            i++;
        }
        return answer;
    }
    
    public static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}