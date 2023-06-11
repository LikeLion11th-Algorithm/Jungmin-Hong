class Solution {
    public String solution(String rny_string) {
        for (int i=0; i<rny_string.length(); i++) {
            if (rny_string.charAt(i)=='m') rny_string = rny_string.substring(0,i) + "rn" + rny_string.substring(i+1);
        }
        return rny_string;
    }
}