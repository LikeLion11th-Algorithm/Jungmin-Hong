class Solution {
    public String solution(String my_string, String letter) {
        String[] split = my_string.split("");
        String[] except = new String[split.length];
        for (int i=0; i<split.length; i++) {
            if (!split[i].equals(letter)) {
                except[i] = split[i];
            }
            else except[i] = "";
        }
        String answer = String.join("", except);
        return answer;
    }
}