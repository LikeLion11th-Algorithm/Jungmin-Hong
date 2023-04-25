class Solution {
    public String solution(String my_string) {
        String[] str = my_string.split("");
        String[] answer = new String[str.length];
        boolean flag = false;
        for (int i=0; i<str.length; i++) {
            for (int k=0; k<answer.length; k++) {
                if (str[i].equals(answer[k])) {
                    flag = true;
                    break;
                }
                else flag = false;
            }
            if (flag == true) answer[i] = "";
            else answer[i] = str[i];
        }
        String asw = String.join("", answer);
        return asw;
    }
}