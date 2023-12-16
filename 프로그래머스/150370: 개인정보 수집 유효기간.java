import java.util.*;
import java.time.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        
        for (int i=0; i<terms.length; i++) {
            String[] s = terms[i].split(" ");
            hm.put(s[0], Integer.parseInt(s[1]));
        }
        
        for (int i=0; i<privacies.length; i++) {
            String[] s = privacies[i].split(" ");
            
            String[] date = s[0].split("\\.");
            int year = Integer.parseInt(date[0]) + (Integer.parseInt(date[1]) + hm.get(s[1]))/12;
            int month = (Integer.parseInt(date[1])+hm.get(s[1]))%12;
            if (month==0) {
                month = 12;
                year -= 1;
            }
            int day = Integer.parseInt(date[2]) - 1;
            if (day==0) {
                day = 28;
                month -= 1;
                if (month==0) {
                    month = 12;
                    year -= 1;
                }
            }
            
            String[] Today = today.split("\\.");
            LocalDate ldt = LocalDate.of(Integer.parseInt(Today[0]),Integer.parseInt(Today[1]),Integer.parseInt(Today[2]));
            LocalDate ldd = LocalDate.of(year, month, day);
            if (ldt.isAfter(ldd)) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}