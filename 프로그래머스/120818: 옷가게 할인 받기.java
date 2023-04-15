class Solution {
    public int solution(int price) {
        
        if (price >= 100000 && price <300000) {
            return price/100*95;
        } 
        if (price >= 300000 && price < 500000) {
            return price/100*90;
        } 
        if (price >= 500000) {
            return price/100*80;
        }
        return price;
    }
}