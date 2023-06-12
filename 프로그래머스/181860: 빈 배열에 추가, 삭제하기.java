import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (flag[i]) for (int k=0; k<arr[i]*2; k++) answer.add(arr[i]);
            else for (int k=0; k<arr[i]; k++) answer.remove(answer.size()-1);
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
}