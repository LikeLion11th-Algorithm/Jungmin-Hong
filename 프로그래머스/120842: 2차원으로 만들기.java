class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int num=0;
        for (int i=0; i<num_list.length/n; i++) {
            for (int k=0; k<n;k++) {
                answer[i][k] = num_list[num];
                num++;
            }
        }
        
        return answer;
    }
}