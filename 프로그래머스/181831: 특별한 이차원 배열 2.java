class Solution {
    public int solution(int[][] arr) {
        for (int i=0; i<arr.length/2+1; i++) {
            for (int k=0; k<arr.length/2+1; k++) {
                if (arr[i][k] != arr[k][i]) return 0;
            }
        }
        return 1;
    }
}