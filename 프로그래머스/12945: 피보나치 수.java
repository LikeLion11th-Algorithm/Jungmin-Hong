class Solution {
    public int solution(int n) {
        return fibo(n);
    }
    
    public int fibo(int n) {
        return n>=2 ? fibo(n-1)+fibo(n-2) : n;
    }
}