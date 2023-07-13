class Solution {
    public int solution(long num) {
        int cnt = 0;
        if (num==1) return 0;
        while (num!=1) {
            cnt++;
            num = (num%2==0)? num/2 : num*3+1;
            if (cnt>=500) return -1;
        }
        return cnt;
    }
}