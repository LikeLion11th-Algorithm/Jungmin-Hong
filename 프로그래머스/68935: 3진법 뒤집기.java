class Solution {
    public int solution(int n) {        
        StringBuilder answer = new StringBuilder(Integer.toString(n, 3));        
        return Integer.parseInt(answer.reverse().toString(), 3);
    }
}