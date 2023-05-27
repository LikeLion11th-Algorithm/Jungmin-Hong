class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] str = my_string.split("");
        String answer = "";
        for (int i=0; i<index_list.length; i++) {
            answer += str[index_list[i]];
        }
        return answer;
    }
}