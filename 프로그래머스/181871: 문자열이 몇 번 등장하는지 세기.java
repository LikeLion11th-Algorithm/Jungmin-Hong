class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx = -1;
        for (int i=0; i<myString.length(); i++) {
            if (myString.indexOf(pat)!=-1 && myString.indexOf(pat)!=idx) {
                idx = myString.indexOf(pat);
                answer++;
            }
            myString = myString.substring(0, i) + '0' + myString.substring(i+1);
        }
        return answer;
    }
}