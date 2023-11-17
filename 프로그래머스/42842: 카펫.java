class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int size=brown+yellow;
        for (int i=3; i<size/2; i++) {
            if (size%i == 0) {
                answer[1]=i;
                answer[0]=size/i;
                if ((answer[0]-2)*(answer[1]-2) == yellow) break;
            }
        }
        
        return answer;
    }
}