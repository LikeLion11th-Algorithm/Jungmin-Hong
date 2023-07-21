class Solution {
    public String solution(String s, int n) {
        char[] chars = s.toCharArray();
        String answer = "";
        for (char c : chars) {
            if (Character.isLowerCase(c)) {
                c = (char) ('a' + (c-'a'+n)%26);
            } else if (Character.isUpperCase(c)) {
                c = (char) ('A' + (c-'A'+n)%26);
            }
            answer += String.valueOf(c);
        }
        
        return answer;
    }
}