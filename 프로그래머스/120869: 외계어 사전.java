import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        String word1 = String.join("", spell);
        
        for (int i=0; i<dic.length; i++) {
            String[] str = dic[i].split("");
            Arrays.sort(str);
            String word2 = String.join("", str);
            if (word1.equals(word2)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}