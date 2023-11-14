import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] score = new int[3]; 
        // 수포1
        int[] pattern1 = {1, 2, 3, 4, 5};
        // 수포2
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        // 수포3
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == pattern1[i % pattern1.length]) score[0]++;
            if (answers[i] == pattern2[i % pattern2.length]) score[1]++;
            if (answers[i] == pattern3[i % pattern3.length]) score[2]++;
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
}