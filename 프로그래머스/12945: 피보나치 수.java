import java.util.*;

class Solution {
    int[] fibo1;
    public int solution(int n) {
        fibo1 = new int[n + 1];
        Arrays.fill(fibo1, -1);
        fibo1[0] = 0;
        fibo1[1] = 1;
        return fibo2(n)%1234567;
    }
    
    public int fibo2(int n) {
        if (fibo1[n]==-1) fibo1[n] = fibo2(n-1)+fibo2(n-2);
        return fibo1[n];
    }
    
}