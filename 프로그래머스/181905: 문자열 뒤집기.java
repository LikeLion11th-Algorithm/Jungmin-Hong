class Solution {
    public String solution(String my_string, int s, int e) {
        char[] c = my_string.toCharArray();
        while (s < e) {
            char tmp = c[s];
            c[s++] = c[e];
            c[e--] = tmp;
        }
        return new String(c);
    }
}