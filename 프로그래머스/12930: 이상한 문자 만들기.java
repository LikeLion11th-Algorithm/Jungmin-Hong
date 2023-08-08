class Solution {
    public String solution(String s) {
        String[] answer = s.split("\\s+");
        for (int i=0; i<answer.length; i++) {
            String word = "";
            String[] chars = answer[i].split("");
            for (int k=0; k<chars.length; k++) {
                word += k%2==0 ? chars[k].toUpperCase() : chars[k].toLowerCase();
            }
            answer[i] = word;
        }
        return String.join(" ", answer);
    }
}