class Solution {
    public int[] solution(int n) {
        int index = n/2 + n%2;
        int[] answer = new int[index];
        for (int i=0; i<index; i++) {
            answer[i] = i*2+1;
        }
        
        return answer;
    }
}