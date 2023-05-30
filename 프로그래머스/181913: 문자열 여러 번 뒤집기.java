class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] c = my_string.toCharArray();
        for (int i=0; i<queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            reverse(c, start, end);
        }
        return String.valueOf(c);
    }
    public void reverse(char[] c, int start, int end) {
        while (start < end) {
            char tmp = c[start];
            c[start++] = c[end];
            c[end--] = tmp;
        }
    }
}