import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i=0; i<intStrs.length; i++) {
            String str = intStrs[i].substring(s, s+l);
            if (Integer.parseInt(str)>k) arr.add(Integer.parseInt(str));
        }
        
        return arr.stream().mapToInt(i->i).toArray();
    }
}