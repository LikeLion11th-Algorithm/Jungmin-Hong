class Solution {
    public int solution(String my_string) {
        String integers = my_string.replaceAll("[^0-9]", "");
        String[] split = integers.split("");
        int answer = 0;
        
        for (int i=0; i<split.length; i++) {
            answer += Integer.parseInt(split[i]);
        }
        
        return answer;
    }
}