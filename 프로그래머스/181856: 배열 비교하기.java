import java.util.*;
class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            if (Arrays.stream(arr1).sum() > Arrays.stream(arr2).sum()) return 1;
            else if (Arrays.stream(arr1).sum() < Arrays.stream(arr2).sum()) return -1;
            else return 0;
        }
        
        return arr1.length > arr2.length ? 1:-1;
    }
}