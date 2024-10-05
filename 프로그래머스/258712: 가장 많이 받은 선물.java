import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int flen = friends.length;
        
        // 서로 주고 받은 선물 계산
        int[][] gnum = new int[flen][flen];
        
        // 선물 지수 계산, 주었다면 해당인 -1, 받았다면 +1
        int[] idx = new int[flen];
        
        // 인물별 식별(인덱스)번호 부여
        Map<String, Integer> fnum = new HashMap<>();
        for (int i=0; i<flen; i++) {
            fnum.put(friends[i],i);
        }
        
        for (int i=0; i<gifts.length; i++) {
            // [0]=준 사람, [1]=받은 사람
            String[] s = gifts[i].split(" ");
            int index1 = fnum.get(s[0]); // 준 사람의 번호 저장
            int index2 = fnum.get(s[1]); // 받은 사람의 번호 저장
            gnum[index1][index2]++;
            idx[index1]--;
            idx[index2]++;
        }
        
        for (int i=0; i<flen; i++) {
            int num = 0;
            for (int k=0; k<flen; k++) {
                if (i==k) continue;
                if (gnum[i][k]>gnum[k][i]) num++;
                else if (gnum[i][k]==gnum[k][i] && idx[i]<idx[k]) num++;
            }
            answer = Math.max(answer, num);
        }
        
        
        
        return answer;
    }
}