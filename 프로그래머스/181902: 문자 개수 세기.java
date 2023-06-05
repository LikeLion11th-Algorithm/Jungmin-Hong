class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] alph = my_string.toCharArray();
        for (char c : alph) {
            if (c >= 'a') answer[c-'a'+26]++;
            else answer[c-'A']++;
        }
        return answer;
    }
}