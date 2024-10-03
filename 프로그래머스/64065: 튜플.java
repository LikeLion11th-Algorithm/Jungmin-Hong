import java.util.*;

class Solution {
    public int[] solution(String s) {        
        s = s.replaceAll("\\{", "");
        s = s.replaceAll("\\}", "");
        s = s.replaceAll("\\,", " ");
        
        
        String[] snum = s.split(" ");
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String num : snum) {
            if (map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num, 1);
        }
        
        int[] answer = new int[map.size()];
        for (String key:map.keySet()) answer[map.size()-map.get(key)] = Integer.parseInt(key);
        
        return answer;
    }
}