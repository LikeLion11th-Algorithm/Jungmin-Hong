class Solution {
    public int solution(String binomial) {
        String[] form = binomial.split(" ");
        int answer = Integer.parseInt(form[0]);
        switch (form[1]) {
            case "+":
                answer += Integer.parseInt(form[2]);
                break;
            case "-":
                answer -= Integer.parseInt(form[2]);
                break;
            case "*":
                answer *= Integer.parseInt(form[2]);
                break;
        }
        return answer;
    }
}