import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        // 누가 말하는 단어인지
        int personIdx=0;
        // 사람의 차례
        int idx=0;
        
        ArrayList<String> word = new ArrayList<>();
        int[] answer = new int[2];
        
        for (int i=0; i<words.length; i++) {
            if (i%n==0) idx++;
            personIdx++;
            // 앞 단어의 마지막 글자와 단어의 첫 글자가 같지 않다면 break
            if (i!=0 && words[i-1].charAt(words[i-1].length()-1)!=words[i].charAt(0)) break;
            else if (word.contains(words[i])) break;
            else word.add(words[i]);
        }

        if (idx*n==words.length && word.size()==words.length) {
            answer[0]=0;
            answer[1]=0;
        }
        else {
            answer[0]=personIdx%n==0 ? n:personIdx%n;
            answer[1]=idx;
        }

        return answer;
    }
}