import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (!answer.isEmpty() && answer.get(answer.size()-1)==arr[i]) answer.remove(answer.size()-1);
            else answer.add(arr[i]);
        }
        if (answer.isEmpty()) return new int[] {-1};
        return answer.stream().mapToInt(i->i).toArray();
    }
}