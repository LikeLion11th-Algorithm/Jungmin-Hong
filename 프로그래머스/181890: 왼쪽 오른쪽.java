class Solution {
    public String[] solution(String[] str_list) {
        String answer = "";
        for (int i=0; i<str_list.length; i++) {
            if (str_list[i].equals("l")) {
                answer = getLeft(str_list, i);
                break;
            }
            else if (str_list[i].equals("r")) {
                answer = getRight(str_list, i);
                break;
            }
        }
        return answer.equals("") ? new String[0] : answer.split("");
    }
    
    public String getLeft(String[] str, int idx) {
        String answer = "";
        for (int i=0; i<idx; i++) {
            answer += str[i];
        }
        return answer;
    }
    
    public String getRight(String[] str, int idx) {
        String answer = "";
        for (int i=idx+1; i<str.length; i++) {
            answer += str[i];
        }
        return answer;
    }
}