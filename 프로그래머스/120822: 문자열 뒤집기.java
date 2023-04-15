class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        int len = split.length;
        String[] revert = new String[len];
        for (int i=0; i<len; i++) {
            revert[i] = split[len-i-1];
        }
        String answer = String.join("", revert);
        return answer;
    }
}