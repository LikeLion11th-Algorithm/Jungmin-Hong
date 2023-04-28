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
                if (array[i]-n == gap && array[index] > array[i]) index = i;
            }
            else {
                if (n-array[i] < gap) {
                    index = i; 
                    gap = n-array[i];
                }
                if (n-array[i] == gap && array[index] > array[i]) index = i;
            }   
        }
        int answer = array[index];
        return answer;
    }
}