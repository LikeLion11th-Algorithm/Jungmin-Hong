import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int n : people) list.add(n);

        while (!list.isEmpty()) {
            if (list.size() == 1) return answer+1;
            
            // 제일 무거운 사람과 제일 가벼운 사람의 합이 무게 제한보다 크다면 무거운 사람만 제외
            if (list.get(0) + list.get(list.size()-1) <= limit) list.remove(0);
            list.remove(list.size()-1);
            answer++;
        }
        
        return answer;
    }
}