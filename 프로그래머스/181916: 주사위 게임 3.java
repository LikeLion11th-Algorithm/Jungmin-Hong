import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] num = {a,b,c,d};
        Arrays.sort(num);
        int answer = 0;
        
        // 모두 같을 때
        if (a==b&&b==c&&c==d) answer = 1111*a;
        
        // 세 개가 같을 때
        else if ((num[0]==num[1]&&num[1]==num[2]) || (num[1]==num[2]&&num[2]==num[3])) {
            if (num[0]==num[1]) answer = (int)Math.pow(10*num[1]+num[3],2);
            else answer = (int)Math.pow(10*num[1]+num[0],2);
        }
        // 두 개씩 같을 때
        else if (num[0]==num[1] && num[2]==num[3]) answer = (num[0]+num[2])*Math.abs(num[0]-num[2]);
        
        // 두 개만 같을 때
        else if (num[0]==num[1]) answer = num[2]*num[3];
        else if (num[1]==num[2]) answer = num[0]*num[3];
        else if (num[2]==num[3]) answer = num[0]*num[1];
        
        // 모두 다를 때
        else answer = num[0];
        
        return answer;
    }
}