class Solution {
    public long solution(int price, int money, int count) {
        long left = (long) price*(((count+1)*count)/2) - money;

        return left>0 ? left : 0;
    }
}