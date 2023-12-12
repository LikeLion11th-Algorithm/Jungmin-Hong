import java.util.*;

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
            int year = Integer.parseInt(date[0]);
            year += (Integer.parseInt(date[1]) + hm.get(s[1]))/12;
            int month = (Integer.parseInt(date[1])+hm.get(s[1]))%12;
            int day = Integer.parseInt(date[2]) - 1;
            if (day==0) {
                month -= 1;
                if (month==0) {
                    month = 12;
                    year -= 1;
                }
                day = 28;
            }
            
            String[] Today = today.split("\\.");
            if (Integer.parseInt(Today[0])>year) list.add(i+1);
            else if (Integer.parseInt(Today[1])>month) list.add(i+1);
            else if (Integer.parseInt(Today[2])>day) list.add(i+1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}