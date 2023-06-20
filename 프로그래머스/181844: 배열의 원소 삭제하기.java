import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (!inList(delete_list, arr[i])) answer.add(arr[i]);
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
    public boolean inList(int[] delete, int x) {
        for (int i=0; i<delete.length; i++) {
            if (x==delete[i]) return true;
        }
        return false;
    }
}