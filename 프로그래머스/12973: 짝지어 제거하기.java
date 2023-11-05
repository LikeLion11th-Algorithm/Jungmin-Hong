class Solution {
    public int solution(String s) {          
        StringBuilder sb = new StringBuilder(s);
        for (int i=0; i<sb.length()-1; i++) {
            if (sb.charAt(i) == sb.charAt(i+1)) {
                sb.delete(i, i+2);
                i=-1;
            }
        }

        return sb.length()==0 ? 1:0;
    }
}