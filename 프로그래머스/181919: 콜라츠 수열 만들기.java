import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while (n!=1) {
            arr.add(n);
            if (n%2==0) n /= 2;
            else n = 3*n+1;
        }
        arr.add(1);
        return arr.stream().mapToInt(i -> i).toArray();
    }
}