class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Boolean flag = Math.max(wallet[0],wallet[1])>=Math.max(bill[0],bill[1]) &&
                        Math.min(wallet[0],wallet[1])>=Math.min(bill[0],bill[1]);
        
        // 지갑 사이즈가 지폐보다 작은 경우
        while (!flag) {
            if (Math.max(bill[0],bill[1])==bill[0]) bill[0] /= 2;
            else bill[1] /= 2;
            answer++;
            flag = Math.max(wallet[0],wallet[1])>=Math.max(bill[0],bill[1]) &&
                    Math.min(wallet[0],wallet[1])>=Math.min(bill[0],bill[1]);
        }
        
        return answer;
    }
}