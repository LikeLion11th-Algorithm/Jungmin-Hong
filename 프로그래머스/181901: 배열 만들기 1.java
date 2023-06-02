import java.util.*;
class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int l = k;
        while(k<=n) {
            arr.add(k);
            k += l;
        }
        
        int[] answer = arr.stream().mapToInt(i->i).toArray();
        return answer;
    }
}