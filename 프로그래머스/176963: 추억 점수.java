import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for (int i=0; i<photo.length; i++) {
            int num = 0;
            for (int k=0; k<photo[i].length; k++) {
                int idx = Arrays.asList(name).indexOf(photo[i][k]);
                if (idx != -1) num += yearning[idx];
            }
            answer[i] = num;
        }
        
		
        
        return answer;
    }
}