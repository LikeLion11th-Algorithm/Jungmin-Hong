class Solution {
    public String solution(String code) {
        String answer = "";
        String[] str = code.split("");
        int mode = 0;
        for (int i=0; i<str.length; i++) {
            if (str[i].equals("1")) mode = (mode==0) ? 1:0;
            else answer += (mode==0 && i%2==0) || (mode==1 && i%2!=0) ? str[i]:"";
        }        
        return (!answer.equals("")) ? answer:"EMPTY";
    }
}