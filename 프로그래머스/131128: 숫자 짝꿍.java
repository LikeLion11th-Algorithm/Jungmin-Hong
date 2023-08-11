import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        int[] x = new int[X.length()];
        int[] y = new int[Y.length()];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int idx = 0;
        
        int intX = Integer.parseInt(X);
        int intY = Integer.parseInt(Y);
        
        while (intX>0) {
            x[idx++] = intX%10;
            intX /= 10;
        }
        idx = 0;
        while (intY>0) {
            y[idx++] = intY%10;
            intY /= 10;
        }
        Arrays.sort(x);
        Arrays.sort(y);
        for (int i=0; i<x.length; i++) {
            for (int k=0; k<y.length; k++) {
                if (x[i]==y[k]) {
                    arr.add(x[i]);
                    x[i] = -1;
                    y[k] = -1;
                    break;
                }
            }
        }
        
        if (arr.isEmpty()) return "-1";
        
        // 내림차순 정렬
        arr.sort(Comparator.reverseOrder());
        for (int i=0; i<arr.size(); i++) {
            answer += String.valueOf(arr.get(i));
        }
        
        return String.valueOf(Integer.parseInt(answer));
    }
}