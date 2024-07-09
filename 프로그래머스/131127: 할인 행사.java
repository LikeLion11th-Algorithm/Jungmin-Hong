import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i=0; i<want.length; i++) {
            for (int k=0; k<number[i]; k++) list.add(want[i]);
        }
        
        for (int i=0; i<discount.length-9; i++) {
            ArrayList<String> copy = (ArrayList<String>) list.clone();
            for (int k=0; k<10; k++) {
                if (copy.contains(discount[k+i])) copy.remove(discount[k+i]);
            }
            if (copy.size()==0) answer++;
        }
        
        return answer;
    }
}