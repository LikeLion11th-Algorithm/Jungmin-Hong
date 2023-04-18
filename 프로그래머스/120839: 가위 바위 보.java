class Solution {
    public String solution(String rsp) {
        String[] split = rsp.split("");
        String[] win = new String[split.length];
        
        for (int i=0; i<split.length; i++) {
            if (split[i].equals("2")) win[i] = "0";
            if (split[i].equals("0")) win[i] = "5";
            if (split[i].equals("5")) win[i] = "2";
        }
        
        String answer = String.join("", win);
        return answer;
    }
}