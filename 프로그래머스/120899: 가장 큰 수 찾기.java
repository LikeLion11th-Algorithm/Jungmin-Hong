class Solution {
    public int[] solution(int[] array) {
        int num = 0;
        int idx = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i] > num) {
                num = array[i];
                idx = i;
            }
        }
        int[] answer = {num, idx};
        return answer;
    }
}