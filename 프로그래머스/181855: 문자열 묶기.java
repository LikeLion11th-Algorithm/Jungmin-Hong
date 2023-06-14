import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<strArr.length; i++) {
            if (!list.contains(strArr[i].length())) list.add(strArr[i].length());
        }
        int[] len = new int[list.size()];
        for (int i=0; i<strArr.length; i++) {
            len[list.indexOf(strArr[i].length())]++;
        }
        Arrays.sort(len);
        return len[len.length-1];
    }
}