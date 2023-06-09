import java.util.*;

class Solution {
    public String solution(String letter) {
            Map<String, String> morse = new HashMap<>(){{
            put(".-","a");
            put("-...","b");
            put("-.-.","c");
            put("-..","d");
            put(".","e");
            put("..-.","f");
            put("--.","g");
            put("....","h");
            put("..","i");
            put(".---","j");
            put("-.-","k");
            put(".-..","l");
            put("--","m");
            put("-.","n");
            put("---","o");
            put(".--.","p");
            put("--.-","q");
            put(".-.","r");
            put("...","s");
            put("-","t");
            put("..-","u");
            put("...-","v");
            put(".--","w");
            put("-..-","x");
            put("-.--","y");
            put("--..","z");            
        }};
        
        String[] words = letter.split(" ");
        
        String[] means = new String[words.length];
        for (int i=0; i<words.length; i++) {
            means[i] = morse.get(words[i]);
        }
        
        
        String answer = String.join("", means);
        return answer;
    }
}