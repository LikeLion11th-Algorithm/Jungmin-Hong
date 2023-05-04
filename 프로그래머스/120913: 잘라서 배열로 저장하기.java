class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length()/n;
        if (my_str.length()%n != 0) len++;
        String[] answer = new String[len];
        String[] str = my_str.split("");
        
        for (int i=0; i<len; i++) {
            String s = "";
            for (int k=0; k<n; k++) {
                int idx = (n*i)+k;
                s += str[idx];
                if (idx==my_str.length()-1) break;
            }
            answer[i] = s;
        }
        return answer;
    }
}