import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=l; i<=r; i++) {
            if (i%5==0 && check(i)) arr.add(i);
        }
        if (arr.size()==0) arr.add(-1);
        int[] answer = arr.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    public boolean check(int num) {
        String number = Integer.toString(num);
        for (int i=0; i<number.length(); i++) {
            if (number.charAt(i)!='5' && number.charAt(i)!='0') return false;
        }
        return true;
    }
}