import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for (int i=0; i<numbers.length; i++) {
            for (int k=i+1; k<numbers.length; k++) {
                if (!num.contains(numbers[i]+numbers[k])) num.add(numbers[i]+numbers[k]);
            }
        }
        Collections.sort(num);
        
        return num.stream().mapToInt(i->i).toArray();
    }
}