import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tnum = new HashMap<>();
        int answer = 0;
        
        // 귤 개수 매핑
        for (int t:tangerine) tnum.put(t,tnum.getOrDefault(t, 0) + 1);
        
        // 귤 개수 많은순으로 리스트에 귤 크기 정렬
        ArrayList<Integer> tlist = new ArrayList<>(tnum.keySet());
        tlist.sort(((o1, o2) -> tnum.get(o2) - tnum.get(o1)));
        
        // 귤 개수 많은순으로 종류(answer)++, 총 귤 개수에서 값 제외
        for (int t : tlist) {
            if (k <= 0) break;
            answer++;
            k -= tnum.get(t);
        }

        return answer;
    }
}