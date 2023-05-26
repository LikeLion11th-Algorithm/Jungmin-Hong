class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int diff = 1000000;
        int idx = 0;
        for (int i=0; i<queries.length; i++) {
            diff = 1000000;
            for (int n=queries[i][0]; n<=queries[i][1]; n++) {
                if (arr[n]>queries[i][2] && diff>Math.abs(arr[n]-queries[i][2])) {
                    diff = Math.abs(arr[n]-queries[i][2]);
                    idx = n;
                }
            }
            if (diff == 1000000) answer[i] = -1;
            else answer[i] = arr[idx];
        }
        return answer;
    }
}