class Solution {
    public int solution(int n) {
        // 최소공배수
        int answer = 6*n/gcd(6,n);
        System.out.println(answer);
        if (answer >=6 ) answer /= 6;
        return answer;
        
    }
    public static int gcd(int a, int b){
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}