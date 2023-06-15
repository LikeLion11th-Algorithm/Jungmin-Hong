import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<attendance.length; i++) {
            if (attendance[i]) list.add(rank[i]);
        }
        
        int[] arr = list.stream().mapToInt(i->i).toArray();
        Arrays.sort(arr);
        int answer = rankIdx(rank,arr[0])*10000 + rankIdx(rank,arr[1])*100 + rankIdx(rank,arr[2]);
        
        return answer;
    }
    public int rankIdx(int[] arr, int rank) {
        int answer = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]==rank) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}