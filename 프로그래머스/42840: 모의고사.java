public import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3]; 
        
        for (int i=0; i<answers.length; i++) {
            // 1번 수포자 (0=1,1=2,2=3,3=4,4=5 => 5 나머지)
            if (i%5==0 && answers[i]==1) score[0]++;
            else if (i%5==1 && answers[i]==2) score[0]++;
            else if (i%5==2 && answers[i]==3) score[0]++;
            else if (i%5==3 && answers[i]==4) score[0]++;
            else if (i%5==4 && answers[i]==5) score[0]++;
            
            // 2번 수포자 (i 짝수 -> 2, i 홀수 -> 1=1/3=3/5=4/7=5 => 8 나머지)
            if (i%2==0 && answers[i]==2) score[1]++;
            else if (i%8==1 && answers[i]==1) score[1]++;
            else if (i%8==3 && answers[i]==3) score[1]++;
            else if (i%8==5 && answers[i]==4) score[1]++;
            else if (i%8==7 && answers[i]==5) score[1]++;
            
            
            // 3번 수포자 (i 01=3/23=1/45=2/67=4/89=5 => i/2->0,1,2,3,4)
            if (i/2==0 && answers[i]==3) score[2]++;
            else if (i/2==1 && answers[i]==1) score[2]++;
            else if (i/2==2 && answers[i]==2) score[2]++;
            else if (i/2==3 && answers[i]==4) score[2]++;
            else if (i/2==4 && answers[i]==5) score[2]++;
        }
        
        List<Integer> maxIdx = new ArrayList<>();
        int max = score[0];
        for (int i=0; i<score.length; i++) {
            int sc = score[i];
            if (sc > max) {
                max = sc;
                maxIdx.clear(); // 최댓값이 바뀌었으므로 리스트 초기화
                maxIdx.add(i+1); // 새로운 최댓값의 인덱스 추가
            } else if (sc == max) {
                maxIdx.add(i+1);
            }
        }
        
        return maxIdx.stream().mapToInt(Integer::intValue).toArray();
    }
} 42840: 모의고사 {
    
}
