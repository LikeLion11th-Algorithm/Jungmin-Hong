class Solution {
    public int solution(String s) {
        String[] split = s.split(" ");
        int num = 0;
        int answer = 0;
        for (int i=0; i<split.length; i++) {
            if (!split[i].equals("Z")) {
                num = Integer.parseInt(split[i]);
                answer += num;
            }
            else answer -= num;
        }
        
        return answer;
    }
}