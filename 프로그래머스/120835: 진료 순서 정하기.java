import java.util.*; 

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = new int[emergency.length];
        for (int i=0; i<emergency.length; i++) sorted[i] = emergency[i];
        Arrays.sort(sorted);
        int[] answer = new int[emergency.length];
        
        for (int i=0; i<emergency.length; i++) {
            for (int k=0; k<emergency.length; k++) {
                if (sorted[k] == emergency[i]) {
                    System.out.println(sorted[k]);
                    answer[i] = emergency.length-k;
                }
            }
        }
        
        return answer;
    }
}