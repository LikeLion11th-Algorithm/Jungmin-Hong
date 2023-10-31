class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int max=Integer.parseInt(str[0]);
        int min=Integer.parseInt(str[0]);
        for (int i=1; i<str.length; i++) {
            int num = Integer.parseInt(str[i]);
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}