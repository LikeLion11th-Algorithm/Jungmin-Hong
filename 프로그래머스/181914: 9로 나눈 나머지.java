class Solution {
    public int solution(String number) {
        String[] num = number.split("");
        int answer = 0;
        
        for (int i=0; i<num.length; i++) {
            answer += Integer.parseInt(num[i]);
        }
        
        return answer%9;
    }
}