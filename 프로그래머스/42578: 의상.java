import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, Integer> map = new HashMap<>();
        for (int i=0; i<clothes.length; i++) {
            String type = clothes[i][1];
            if (map.containsKey(type)) map.put(type, map.get(type)+1);
            else map.put(type, 1);
        }
        
        Set<String> keySet = map.keySet();   
        for (String key : keySet) {
            answer *= map.get(key)+1;
        }
        
        return answer-1;
    }
}