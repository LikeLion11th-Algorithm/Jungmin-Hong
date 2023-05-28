import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<arr.length; i++) {
            if (list.size()==0 || list.get(list.size()-1)<arr[i]) list.add(arr[i]);
            else if (list.get(list.size()-1)>=arr[i]) {
                list.remove(list.size()-1);
                i--;
            }
        }
        
        int[] stk = list.stream().mapToInt(i->i).toArray();
        return stk;
    }
}