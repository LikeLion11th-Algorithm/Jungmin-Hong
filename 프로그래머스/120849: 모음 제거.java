class Solution {
    public String solution(String my_string) {
        String[] split = my_string.split("");
        String[] vowels = {"a", "e", "i", "o", "u"};
        String[] gather = new String[split.length];
        for (int i=0; i<split.length; i++) {
            for (int k=0; k<5; k++) {
                if (split[i].equals(vowels[k])) {
                    gather[i] = ""; 
                    break;
                }
                else gather[i] = split[i];
            }
        }
        
        String answer = String.join("", gather);
        return answer;
    }
}