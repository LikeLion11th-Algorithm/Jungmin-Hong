import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        int left = age;
        int len = 1;
        int n = 1;
        ArrayList<Integer> split_age = new ArrayList<>();
        if (age == 1000) return "baaa";
        if (99 < age && age < 1000) {
            n = 100;
            len = 3;
        }
        if (9 < age && age < 100) {
            n = 10;
            len = 2;
        }
        
        for (int i=0; i<len; i++) {
            split_age.add(left/n);
            left = age%n;
            n = n/10;
        }
        
        String[] alph_age = new String[10];
        char c = 97;
        for (int i=0; i<10; i++) {
            alph_age[i] = String.valueOf(c);
            c++;
        }
        String[] alph = new String[split_age.size()];
        for (int i=0; i<split_age.size(); i++) {
            int index = split_age.get(i);
            alph[i] = alph_age[index];
        }
        String answer = String.join("", alph);
        return answer;
    }
}