class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i=0; i<strlist.length; i++) {
            String[] str = strlist[i].split("");
            answer[i] = str.length;
        }
        return answer;
    }
}