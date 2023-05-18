import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] diff = new double[numlist.length];
            
        for (int i=0; i<numlist.length; i++) {
            diff[i] = (numlist[i]-n < 0) ? n-numlist[i]+0.1: numlist[i]-n;
        }
        
        Arrays.sort(diff);
        
        for(int i=0; i<numlist.length; i++) {
            // 만약 numlist[i]가 n보다 큰 수였다면
            if ((diff[i]%1)==0) answer[i] = (int)diff[i]+n;
            else answer[i] = n-(int)diff[i];
        }
        
        return answer;
    }
}