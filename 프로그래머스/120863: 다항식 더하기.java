class Solution {
    public String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll("\\+ ", "");
        String[] str = polynomial.split(" ");
        int x1 = 0;
        int x2 = 0;
        for (int i=0; i<str.length; i++) {
            if (str[i].contains("x")) {
                str[i] = str[i].replace("x", "");
                if (str[i].equals("")) x1 += 1;
                else x1 += Integer.parseInt(str[i]);
            }
            else x2 += Integer.parseInt(str[i]);
        }
        if (x1 != 0) {
            if (x1 != 1) answer += Integer.toString(x1);
            answer += "x";
        }
        if (x1 == 0 && x2 != 0) {
            answer += Integer.toString(x2);
        }
        if (x1 != 0 && x2 != 0) {
            answer += " + ";
            answer += Integer.toString(x2);
        }
        if (x1 == 0 && x2 == 0) answer += "0";
        return answer;
    }
}