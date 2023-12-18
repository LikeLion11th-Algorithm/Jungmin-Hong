import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length/2;
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i=0; i<nums.length; i++) {
            if (set.size()==N) break;
            set.add(nums[i]);
        }
        
        return set.size();
    }
}