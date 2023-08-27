import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[]{1,1};
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        if (Arrays.equals(lottos, win_nums)) return answer;
        
        int zCnt=0, cnt=0;
        
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i]==0) zCnt++;
            else {
                for (int k=0; k<win_nums.length; k++) {
                    if (lottos[i]==win_nums[k]) {
                        cnt++; 
                        break;
                    }
                }
            }
        }
        switch (cnt) {
            case 0: 
                answer[1] = 6;
                answer[0] = zCnt==6 ? 1:6-zCnt;
                break;
            case 1:
                answer[1] = 6;
                answer[0] = zCnt==0 ? 6:6-zCnt;
                break;
            case 2:
                answer[1] = 5;
                answer[0] = zCnt==4 ? 1:5-zCnt;
                break;
            case 3:
                answer[1] = 4;
                answer[0] = zCnt==3 ? 1:4-zCnt;
                break;
            case 4:
                answer[1] = 3;
                answer[0] = zCnt==2 ? 1:3-zCnt;
                break;
            case 5:
                answer[1] = 2;
                answer[0] = zCnt==1 ? 1:2;
                break;
        }
        
        return answer;
    }
}