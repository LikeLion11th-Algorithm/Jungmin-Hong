import java.util.*; 

class Solution {
    public ArrayList<Integer> solution(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int i = 2 ;
        while (n != 1) {
            if (n%i == 0) {
                set.add(i);
                while (n%i==0) {
                    n /= i;
                }
            }
            i++;
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}