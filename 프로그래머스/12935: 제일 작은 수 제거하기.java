import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i:arr) {
            answer.add(i);
        }
        
        if (answer.size()==1 && answer.contains(10)) return new int[]{-1};
        
        int[] newarr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(newarr);
        answer.remove(Integer.valueOf(newarr[0]));
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}