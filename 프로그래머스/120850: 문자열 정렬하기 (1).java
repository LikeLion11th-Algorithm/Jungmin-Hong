import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String integers = my_string.replaceAll("[^0-9]", "");
        String[] split = integers.split("");
        int[] number = new int[split.length];
        
        for (int i=0; i<split.length; i++) {
            number[i] = Integer.parseInt(split[i]);
        }
        
        Arrays.sort(number);
        return number;
    }
}