class Solution {
    boolean solution(String s) {
        int n = 0;
        for (char c:s.toCharArray()) {
            if (c=='(') n++;
            else if (n==0) return false;
            else n--;
        }
        return n==0 ? true:false;
    }
}