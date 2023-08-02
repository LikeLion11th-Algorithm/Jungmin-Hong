import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String prev = "";
        
        for (int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replaceAll("aya", "1");
            babbling[i] = babbling[i].replaceAll("ye", "2");
            babbling[i] = babbling[i].replaceAll("woo", "3");
            babbling[i] = babbling[i].replaceAll("ma", "4");
            
            if (babbling[i].matches("[0-9]+")) {
                String[] babble = babbling[i].split("");
                boolean flag = true;
                for (int k=0; k<babble.length-1; k++) {
                    if (babble[k].equals(babble[k+1])) flag=false;
                }
                if (flag) answer++;
            }
        }
        
        return answer;
    }
}