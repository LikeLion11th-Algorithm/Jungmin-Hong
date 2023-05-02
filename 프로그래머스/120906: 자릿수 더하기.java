class Solution {
    public int solution(int n) {
        String[] str = Integer.toString(n).split("");
        int answer = 0;
        
        for (int i=0; i<str.length; i++) {
            answer += Integer.parseInt(str[i]);
        }
        
        return answer;
    }
}