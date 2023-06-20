class Solution {
    boolean solution(String s) {
        String p = s.replaceAll("[^pP]", "");
        String y = s.replaceAll("[^yY]", "");
        boolean answer = p.length()==y.length() ?true:false;
        
        return answer;
    }
}