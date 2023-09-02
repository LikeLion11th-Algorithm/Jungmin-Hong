class Solution {
    public String solution(String s) {
        String[] answer = s.split("");
        int idx = 0;
        
        // 1. 띄어쓰기가 아니면 인덱싱 시작
        // 2. 인덱스가 짝수면 대문자
        // 3. 인덱스가 홀수면 소문자로 변경
        
        for (int i=0; i<answer.length; i++) {
            if (answer[i].equals(" ")) idx=0;
            else {
                if (idx%2==0) answer[i] = answer[i].toUpperCase();
                else answer[i] = answer[i].toLowerCase();
                idx++;
            }
        }
        return String.join("", answer);
    }
}