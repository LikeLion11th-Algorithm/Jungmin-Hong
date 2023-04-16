class Solution {
    public int solution(int n, int k) {
        int free = n/10;
        int cost = 0;
        if (free < k) cost += (k-free)*2000 + n*12000;
        else cost += n*12000;
        
        return cost;
    }
}