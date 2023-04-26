class Solution {
    public int solution(int[] array, int n) {
        int index = 0;
        int gap = n;
        for (int i=0; i<array.length; i++) {
            if (array[i] >= n){
                if (array[i]-n < gap) {
                    index = i;
                    gap = array[i]-n;
                }
            }
            else {
                if (n-array[i] < gap) {
                    index = i; 
                    gap = n-array[i];
                }
            }   
        }
        int answer = array[index];
        return answer;
    }
}