class Solution {
    public String solution(String cipher, int code) {
        String[] ciphers = cipher.split("");
        int len = ciphers.length/code;
        String[] plain = new String[len];
        for (int i=1; i<=len; i++) {
            plain[i-1] = ciphers[code*i-1];
        }
        String answer = String.join("", plain);
        return answer;
    }
}